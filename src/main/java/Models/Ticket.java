package Models;

import java.util.List;

/*
 *   The Ticket is a model built for transfer from Json Object to Java Object.
 * */
public class Ticket {
    private String _id;
    private String url;
    private String external_id;
    private String created_at;
    private String type;
    private String subject;
    private String description;
    private String priority;
    private String status;
    private int submitter_id;
    private int assignee_id;
    private int organization_id;
    private List<String> tags;
    private boolean has_incidents;
    private String due_at;
    private String via;
    @Override
    public String toString() {
        return "---------------------------------------------" + '\n' +
                "Ticket{" +  '\n' +
                " _id : " + _id + '\n' +
                " url : " + url + '\n' +
                " external_id : " + external_id + '\n' +
                " created_at : " + created_at + '\n' +
                " type : " + type + '\n' +
                " subject : " + subject + '\n' +
                " description : " + description + '\n' +
                " priority : " + priority + '\n' +
                " status : " + status + '\n' +
                " submitter_id : " + submitter_id + '\n' +
                " assignee_id : " + assignee_id + '\n' +
                " organization_id : " + organization_id + '\n' +
                " tags : " + tags + '\n' +
                " has_incidents : " + has_incidents + '\n' +
                " due_at : " + due_at + '\n' +
                " via : " + via + '\n' +
                '}';
    }
}
