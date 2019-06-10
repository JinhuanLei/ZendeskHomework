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
     *      1. According to search options user chooses to perform corresponding actions.
     *      2. Handle the Invalid input and response with a invalid input warning.
     *
     *  Input:
     *      Enum Type of Search options
     * */
    public void chooseSearchOptions(KeyType searchOptions) throws Exception {
        switch (searchOptions) {
            case QUIT:
                System.out.println("Thank you!");
                System.out.println("Quit!");
                break;
            case SEARCH:
                chooseModelType();
                break;
            case HELP:
                View.modelViewHelpManual();
                iu.getEnterKey();
                break;
            case INVALID:
                System.out.println("Invalid Input!");
                iu.getEnterKey();
                break;
            default:
                System.out.println("Unknown Input!");
        }
    }

    /*  Descriptions:
     *      1. According to model options user chooses to perform search functions for corresponding fields
     *      2. Handle the Invalid input and response with a invalid input warning.
     * */
    public void chooseModelType() throws Exception {
        View.modelOptionsView();
        ModelType modelType = iu.getModelType();
        if(modelType == ModelType.INVALID){
            System.out.println("Invalid Input!");
            iu.getEnterKey();
            chooseModelType();
            return;
        }
        String term = iu.getSearchTerm(modelType);
        String value = iu.getSearchValue();
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
