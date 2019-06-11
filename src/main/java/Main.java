import Controllers.QueryController;
import Utils.InputUtil;
import Utils.KeyType;
import Utils.ModelType;
import Views.View;

public class Main {
    /*
     *  Entrance of the application, initialize the essential objects to start the application.
     * */
    private QueryController qc;
    private InputUtil iu;

    public Main() {
        qc = new QueryController();
        iu = new InputUtil();
    }

    public static void main(String args[]) throws Exception {
        Main main = new Main();
        KeyType searchOptions = null;
        while (searchOptions != KeyType.QUIT) {
            View.searchOptionsView();
            searchOptions = main.iu.getSearchOptions();
            main.chooseSearchOptions(searchOptions);
        }
    }

    /*  Descriptions:
     *      1. According to search options user chooses to perform corresponding actions.
     *      2. Handle the Invalid input and response with a invalid input warning.
     *
     *  Input:
     *      Enum Type of Search options
     * */
    public void chooseSearchOptions(KeyType searchOptions) throws Exception {
        if (searchOptions == null) {
            return;
        }
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

    public void chooseModelType() throws Exception {
        View.modelOptionsView();
        ModelType modelType = iu.getModelType();
        if (modelType == ModelType.INVALID) {
            System.out.println("Invalid Input!");
            iu.getEnterKey();
            chooseModelType();
            return;
        }
        String term = iu.getSearchTerm(modelType);
        String value = iu.getSearchValue();
        qc.queryThings(modelType, term, value);
    }
}
