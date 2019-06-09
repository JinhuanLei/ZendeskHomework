import Controllers.QueryController;
import Utils.InputUtil;
import Utils.KeyType;
import Views.View;

public class Main {
    public static void main(String args[]) throws Exception {
        View v = new View();
        QueryController qc = new QueryController();
        KeyType searchOptions = null;
        while (searchOptions != KeyType.QUIT) {
            v.searchOptionsView();
            searchOptions = InputUtil.getSearchOptions();
            qc.chooseSearchOptions(searchOptions);
        }
    }
}
