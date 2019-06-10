package Repositories;

import Models.User;
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
 *   The UserRepository can communicating with the User database
 * */
public class UserRepository {
    private List<User> userList;
    private InputUtil iu;
    private ClassUtil cu;
    public UserRepository(){
        init();
        iu = new InputUtil();
        cu = new ClassUtil();
    }
    private void init() {
        InputStream inputStream = this.getClass().getResourceAsStream("users.json");
        InputStreamReader reader = new InputStreamReader(inputStream);
        Gson gson = new Gson();
        userList = gson.fromJson(reader, new TypeToken<List<User>>() {
        }.getType());
        try {
            inputStream.close();
            reader.close();
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
    public List<User> queryThings(String term, String value) throws Exception {
        List<User> result = new ArrayList<>();
        for (User o : userList) {
            cu.reflectingUser(term, value, result, o);
        }
        for (User o : result) {
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
        UserRepository ur = new UserRepository();
        System.out.println(ur.userList.get(0));
    }
}
