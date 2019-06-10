package Repositories;

import Models.Organization;
import Utils.ClassUtil;
import Utils.InputUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
 *   The OrganizationRepository can communicating with the Organization database
 * */
public class OrganizationRepository {
    private List<Organization> organizationList;
    private InputUtil iu;
    private ClassUtil cu;
    public OrganizationRepository() {
        init();
        iu = new InputUtil();
        cu = new ClassUtil();
    }
    /*
    *   init the data structures and loading data from .json file to a List<Organization>
    * */
    private void init() {
        InputStream inputStream = this.getClass().getResourceAsStream("organizations.json");
        InputStreamReader reader = new InputStreamReader(inputStream);
        Gson gson = new Gson();
        organizationList = gson.fromJson(reader, new TypeToken<List<Organization>>() {
        }.getType());
        try {
            inputStream.close();
            reader.close();
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
    public List<Organization> queryThings(String term, String value) throws Exception {
        List<Organization> result = new ArrayList<>();
        for (Organization o : organizationList) {
            cu.reflectingOrganization(term, value, result, o);
        }
        for (Organization o : result) {
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


}


