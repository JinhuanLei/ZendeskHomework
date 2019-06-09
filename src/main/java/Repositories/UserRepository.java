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

public class UserRepository {
    List<User> userList;
    public UserRepository(){
        init();
    }
    public void init() {
//        System.out.println("Path: "+ getClass().getResource("/users.json").getPath());
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

    public List<User> queryThings(String term, String value) throws Exception {
        List<User> result = new ArrayList<>();
        for (User o : userList) {
            ClassUtil.reflectingUser(term, value, result, o);
        }
        for (User o : result) {
            System.out.println(o);
        }
        System.out.println("Total " + result.size() + " Item Found");
        InputUtil.getEnterKey();
        return result;
    }

    public static void main(String args[]) throws IOException {
        UserRepository ur = new UserRepository();
        System.out.println(ur.userList.get(0));
    }
}
