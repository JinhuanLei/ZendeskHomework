package Views;

import Utils.ModelType;

public class View {
    public final static String[] USER_TERM = {"_id", "url", "external_id", "name", "alias", "created_at", "active", "verified", "shared", "locale", "timezone"
            , "last_login_at", "email", "phone", "signature", "organization_id", "tags", "suspended", "role"};
    public final static String[] TICKET_TERM = {"_id", "url", "external_id", "created_at", "type", "subject", "description", "priority", "pending", "submitter_id",
            "assignee_id", "organization_id", "tags", "has_incidents", "due_at", "via"};
    public final static String[] ORGANIZATION_TERM = {"_id", "url", "external_id", "name", "domain_names", "created_at", "details", "shared_tickets", "tags"};
    public static void searchOptionsView() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Welcome to Zendesk Search");
        System.out.println("Type 'quit' to exit at any time, Press 'Enter' to continue");
        System.out.println("Select search options:");
        System.out.println("    * Press 1 to search Zendesk");
        System.out.println("    * Press 2 to View a list of searchable fields");
        System.out.println("    * Type 'quit' to exit");
    }

    public static String[] getTermArr(ModelType modelType){
        switch(modelType){
            case USER:
                return USER_TERM;
            case TICKET:
                return TICKET_TERM;
            case ORGANIZATION:
                return ORGANIZATION_TERM;
        }
        return null;
    }

    public static void modelOptionsView() {
        System.out.println("Select Search Options:");
        System.out.println("  * Press 1 to search User");
        System.out.println("  * Press 2 to search Ticket");
        System.out.println("  * Press 3 to search Organization");
    }


    public static void modelViewHelpManual() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Search Users with:");
        for (String str : USER_TERM) {
            System.out.println(str);
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Search Ticket with:");
        for (String str : TICKET_TERM) {
            System.out.println(str);
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Search Organization with:");
        for(String str : ORGANIZATION_TERM){
            System.out.println(str);
        }
        System.out.println();
    }
}
