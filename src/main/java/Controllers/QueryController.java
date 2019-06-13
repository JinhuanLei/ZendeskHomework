package Controllers;

import Models.Organization;
import Models.Ticket;
import Models.User;
import Services.QueryService;
import Utils.InputUtil;
import Utils.ModelType;

import java.util.ArrayList;
import java.util.List;

/*
 *   The QueryController handles the requests for
 *       1. Choose search options
 *       2. choose model type.
 *   This class will also check the correctness of keyboard input;
 * */
public class QueryController {
    private QueryService qs;
    private InputUtil iu;
    public QueryController(){
        qs = new QueryService();
        iu = new InputUtil();
    }

    /*  Descriptions:
     *      1. According to model options user chooses to perform search functions for corresponding fields
     *      2. Handle the Invalid input and response with a invalid input warning.
     * */
    public void queryThings(ModelType modelType, String term, String value) throws Exception {
        if(modelType == null || term == null || value == null){
            return;
        }
        switch (modelType){
            case USER:
                List<User> users = new ArrayList<>();
                qs.queryUser(users, term, value);
                break;
            case TICKET:
                List<Ticket> tickets = new ArrayList<>();
                qs.queryTicket(tickets, term, value);
                break;
            case ORGANIZATION:
                List<Organization> organizations = new ArrayList<>();
                qs.queryOrganization(organizations, term, value);
                break;
        }
    }
}
