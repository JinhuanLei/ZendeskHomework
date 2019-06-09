package Controllers;
import Services.QueryService;
import Utils.InputUtil;
import Utils.KeyType;
import Utils.ModelType;
import Views.View;

public class QueryController {
    QueryService qs;
    public QueryController(){
        qs = new QueryService();
    }
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
                InputUtil.getEnterKey();
                break;
            case INVALID:
                System.out.println("Invalid Input!");
                InputUtil.getEnterKey();
                break;
            default:
                System.out.println("Unknown Input!");
        }
    }

    public void chooseModelType() throws Exception {
        View.modelOptionsView();
        ModelType modelType = InputUtil.getModelType();
        if(modelType == ModelType.INVALID){
            System.out.println("Invalid Input!");
            InputUtil.getEnterKey();
            chooseModelType();
            return;
        }
        String term = InputUtil.getSearchTerm(modelType);
        String value = InputUtil.getSearchValue();
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


    public String queryInit(ModelType modelType, String keyWord) {
        return null;
    }
}
