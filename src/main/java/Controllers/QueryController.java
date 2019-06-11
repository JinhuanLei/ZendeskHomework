package Controllers;
import Services.QueryService;
import Utils.InputUtil;
import Utils.KeyType;
import Utils.ModelType;
import Views.View;

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
        switch (modelType){
            case USER:
                qs.queryUser(term, value);
                break;
            case TICKET:
                qs.queryTicket(term, value);
                break;
            case ORGANIZATION:
                qs.queryOrganization(term, value);
                break;
        }
    }
}
