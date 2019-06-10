import Controllers.QueryController;
import Utils.InputUtil;
import Utils.KeyType;
import Views.View;

public class Main {
    /*
     *  Entrance of the application, initialize the essential objects to start the application.
     * */
    public static void main(String args[]) throws Exception {
        QueryController qc = new QueryController();
        InputUtil iu = new InputUtil();
        KeyType searchOptions = null;
        while (searchOptions != KeyType.QUIT) {
            View.searchOptionsView();
            searchOptions = iu.getSearchOptions();
            qc.chooseSearchOptions(searchOptions);
        }
    }
}
