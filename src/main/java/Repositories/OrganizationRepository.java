package Repositories;

import Models.Organization;
import Models.User;
import Utils.ClassUtil;
import Utils.InputUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/*
 *   The OrganizationRepository can communicating with the Organization database
 * */
public class OrganizationRepository extends BaseRepository {
    private List<Organization> organizationList;
    private InputUtil iu;
    private ClassUtil cu;
    private InputStreamReader isr;
    private static final String RESOURCE_NAME = "organizations.json";

    public OrganizationRepository() {
        loadReasorcesReader();
        iu = new InputUtil();
        cu = new ClassUtil();
    }

    @Override
    protected String getResourceName() {
        return RESOURCE_NAME;
    }

    public void loadReasorcesReader() {
        isr = init();
        Gson gson = new Gson();
        organizationList = gson.fromJson(isr, new TypeToken<List<Organization>>() {
        }.getType());
        try {
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
     *   Query the organization by providing its attributes and value.
     *   Input:
     *       term : attributes of organizations
     *       value : the value of the term we care of organizations
     *   Output:
     *       List<Organization> : All the result will be put in a List
     * */

    public List<Organization> queryThings(List result, String term, String value) throws Exception {
        if (result == null || term == null || value == null) {
            return result;
        }
        for (Organization o : organizationList) {
            cu.reflectingOrganization(term, value, result, o);
        }
        for (Organization o : (List<Organization>) result) {
            System.out.println(o);
        }
        System.out.println("Total " + result.size() + " Item Found");
        iu.getEnterKey();
        return result;
    }

    /*
     *  Test Method
     * */
    public static void main(String args[]) {
        OrganizationRepository o = new OrganizationRepository();
        System.out.println(o.organizationList.get(0));
    }

    public List<Organization> getOrganizationList() {
        return organizationList;
    }
}


