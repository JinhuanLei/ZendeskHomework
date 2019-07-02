package Controllers;

import Utils.ModelType;

/*
 * Interface for defining the methods of controller to query things
 * */
public interface Controller {
    public void queryThings(ModelType modelType, String term, String value) throws Exception;
}
