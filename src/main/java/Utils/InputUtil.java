package Utils;

import Views.View;

import java.util.Scanner;

/*
 *   The InputUtil contains the functions for getting the input from keyboard
 * */
public class InputUtil {
    /*
     *   Takes options form input and classify them according to the Enum KeyType
     *   Output:
     *      KeyType : Enum class for search options
     * */
    public static KeyType getSearchOptions() {
        Scanner sc = new Scanner(System.in);
        String searchOptions = sc.nextLine();
        if (searchOptions.length() == 1) {
            char c = searchOptions.charAt(0);
            if (c == '1') {
                return KeyType.SEARCH;
            } else if (c == '2') {
                return KeyType.HELP;
            } else {
                return KeyType.INVALID;
            }
        } else if (searchOptions.equals("quit")) {
            return KeyType.QUIT;
        } else {
            return KeyType.INVALID;
        }
    }

    /*
     *   Takes options form input and classify them according to the Enum ModelType
     *   Output:
     *      ModelType : Enum class for model types
     * */
    public static ModelType getModelType() {
        Scanner sc = new Scanner(System.in);
        String modelOptions = sc.nextLine();
        if (modelOptions.length() == 1) {
            char c = modelOptions.charAt(0);
            if (c == '1') {
                return ModelType.USER;
            } else if (c == '2') {
                return ModelType.TICKET;
            } else if (c == '3') {
                return ModelType.ORGANIZATION;
            }
        }
        return ModelType.INVALID;
    }

    /*
     *   Takes input of search term from keyboard
     *   Output:
      *     Enum class for model types
     * */
    public static String getSearchTerm(ModelType modelType){
        String[] target = View.getTermArr(modelType);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter Search Term:");
            String modelOptions = sc.nextLine();
            for(String str : target){
                if(str.equals(modelOptions)){
                    return modelOptions;
                }
            }
            System.out.println("Term Not Exist!");
            System.out.println();
        }
    }

    /*
     *   Takess input of search value from keyboard.
     *   Output:
     *     String for input value
     * */
    public static String getSearchValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Search Value: ");
        String result = sc.nextLine();
        if(result == null){
            return "";
        }
        return result;
    }

    /*
     *   Takes input of 'Enter' key from keyboard.
     * */
    public static void getEnterKey() {
        System.out.println("Press  'Enter' to continue:");
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        while (key.length() != 0) {
            System.out.println("Press  'Enter' to continue:");
            key = sc.nextLine();
        }
        return;
    }
}
