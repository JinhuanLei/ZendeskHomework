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

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSubmitter_id() {
        return submitter_id;
    }

    public void setSubmitter_id(int submitter_id) {
        this.submitter_id = submitter_id;
    }

    public int getAssignee_id() {
        return assignee_id;
    }

    public void setAssignee_id(int assignee_id) {
        this.assignee_id = assignee_id;
    }

    public int getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(int organization_id) {
        this.organization_id = organization_id;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public boolean isHas_incidents() {
        return has_incidents;
    }

    public void setHas_incidents(boolean has_incidents) {
        this.has_incidents = has_incidents;
    }

    public String getDue_at() {
        return due_at;
    }

    public void setDue_at(String due_at) {
        this.due_at = due_at;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

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
