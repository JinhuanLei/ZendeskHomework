package Models;

import java.util.List;
/*
 *   The Organization is a model built for transfer from Json Object to Java Object.
 * */
public class Organization {
    private int _id;
    private String url;
    private String external_id;
    private String name;
    private List<String> domain_names;
    private String created_at;
    private String details;
    private boolean shared_tickets;
    private List<String> tags;

    @Override
    public String toString() {
        return "---------------------------------------------" + '\n' +
        "Organization{" + '\n' +
                " _id : " + _id + '\n' +
                " url : " + url + '\n' +
                " external_id : " + external_id + '\n' +
                " name : " + name + '\n' +
                " domain_names : " + domain_names + '\n' +
                " created_at : " + created_at + '\n' +
                " details : " + details + '\n' +
                " shared_tickets : " + shared_tickets + '\n' +
                " tags : " + tags + '\n' +
                '}';
    }
}
