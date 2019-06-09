package Models;

import java.util.List;

public class User {
    private int _id;
    private String url;
    private String external_id;
    private String name;
    private String alias;
    private String created_at;
    private boolean active;
    private boolean verified;
    private boolean shared;
    private String locale;
    private String timezone;
    private String last_login_at;
    private String email;
    private String phone;
    private String signature;
    private int organization_id;
    private List<String> tags;
    private boolean suspended;
    private String role;

    @Override
    public String toString() {
        return "---------------------------------------------" + '\n' +
                "User{" + '\n' +
                " _id : " + _id + '\n' +
                " url : " + url + '\n' +
                " external_id : " + external_id + '\n' +
                " name : " + name + '\n' +
                " alias : " + alias + '\n' +
                " created_at : " + created_at + '\n' +
                " active : " + active + '\n' +
                " verified : " + verified + '\n' +
                " shared : " + shared + '\n' +
                " locale : " + locale + '\n' +
                " timezone : " + timezone + '\n' +
                " last_login_at : " + last_login_at + '\n' +
                " email : " + email + '\n' +
                " phone : " + phone + '\n' +
                " signature : " + signature + '\n' +
                " organization_id : " + organization_id + '\n' +
                " tags : " + tags + '\n' +
                " suspended : " + suspended + '\n' +
                " role : " + role + '\n' +
                '}';
    }
}
