package Repositories;

import Models.User;
import Utils.ClassUtil;
import Utils.InputUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/*
 *   The UserRepository can communicating with the User database
 * */
public class UserRepository extends BaseRepository {
    private List<User> userList;
    private InputUtil iu;
    private ClassUtil cu;
    private static final String RESOURCE_NAME = "users.json";
    private InputStreamReader isr;

    public UserRepository() {
        loadReasorcesReader();
        iu = new InputUtil();
        cu = new ClassUtil();
    }

    /*
     *  Method that override the resource name and method
     * */
    @Override
    protected String getResourceName() {
        return RESOURCE_NAME;
    }

    /*
     *  Method that Load Gson Apis to parse the json to the User objects
     * */
    public void loadReasorcesReader() {
        isr = init();
        Gson gson = new Gson();
        userList = gson.fromJson(isr, new TypeToken<List<User>>() {
        }.getType());
        try {
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     *   Query the user by providing its attributes and value.
     *   Input:
     *       term : attributes of users
     *       value : the value of the term we care of users
     *   Output:
     *       List<User> : All the result will be put in a List
     * */
    public List<User> queryUser(List result, String term, String value) throws Exception {
        if (result == null || term == null || value == null) {
            return result;
        }
        for (User o : userList) {
            cu.reflectingUser(term, value, result, o);
        }
        for (User o : (List<User>) result) {
            System.out.println(o);
        }
        System.out.println("Total " + result.size() + " Item Found");
        iu.getEnterKey();
        return result;
    }

    public List<User> getUserList() {
        return userList;
    }

    /*
     *  Test Method
     * */
    public static void main(String args[]) {
        UserRepository ur = new UserRepository();
        System.out.println(ur.userList.get(0));
    }
}
