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

public class OrganizationRepository {
    List<Organization> organizationList;

    public OrganizationRepository() {
        init();
    }

    public void init() {
        System.out.println(this.getClass().getResource("").getPath());
        InputStream inputStream = this.getClass().getResourceAsStream("./organizations.json");
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

    public List<Organization> queryThings(String term, String value) throws Exception {
        List<Organization> result = new ArrayList<>();
        for (Organization o : organizationList) {
            ClassUtil.reflectingOrganization(term, value, result, o);
        }
        for (Organization o : result) {
            System.out.println(o);
        }
        System.out.println("Total " + result.size() + " Item Found");
        InputUtil.getEnterKey();
        return result;
    }

    public static void main(String args[]) throws Exception {
        OrganizationRepository o = new OrganizationRepository();
        System.out.println(o.organizationList.get(0));
//        o.queryThings("created_at", "2016-07-23T09:48:02 -10:00");
    }


}


