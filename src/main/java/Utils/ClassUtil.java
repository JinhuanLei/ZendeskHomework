package Utils;

import Models.Organization;
import Models.Ticket;
import Models.User;

import java.lang.reflect.Field;
import java.util.List;

/*
 *  Using the technique of reflecting to mapping user input to the attribute of data model.
 * */
public class ClassUtil {

    /*
     *   Descriptions:
     *       1. Go through every field of target class and traverse every attribute name and attribute value.
     *       2. find the attribute and distinguish if it meet the requirement of user
     *       3. If we found the answer, add this object into the result List
     *    Input:
     *       term : name of field user provides
     *       value : value of the field user provides
     *       result : the List<Organization> for store the query result
     *       object : the Organization object we current processing
     * */
    public void reflectingOrganization(String term, String value, List<Organization> result, Object object) throws Exception {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
            if (name.equals(term)) {
                if (field.getType().equals(boolean.class)) {
                    if ((value.equals("false") && false == (boolean) field.get(object)) || (value.equals("true") && true == (boolean) field.get(object))) {
                        result.add((Organization) object);
                    }
                } else if (field.getType().equals(List.class)) {
                    List<String> list = (List<String>) field.get(object);
                    for (String str : list) {
                        if (str.equals(value)) {
                            result.add((Organization) object);
                            break;
                        }
                    }
                } else {
                    String target = String.valueOf(field.get(object));
                    if (target.equals(value)) {
                        result.add((Organization) object);
                    }
                }
            }
        }

    }

    /*
     *   Descriptions:
     *       1. Go through every field of target class and traverse every attribute name and attribute value.
     *       2. find the attribute and distinguish if it meet the requirement of user
     *       3. If we found the answer, add this object into the result List
     *    Input:
     *       term : name of field user provides
     *       value : value of the field user provides
     *       result : the List<Ticket> for store the query result
     *       object : the Ticket object we current processing
     * */
    public void reflectingTicket(String term, String value, List<Ticket> result, Object object) throws Exception {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
            if (name.equals(term)) {
                if (field.getType().equals(boolean.class)) {
                    if ((value.equals("false") && false == (boolean) field.get(object)) || (value.equals("true") && true == (boolean) field.get(object))) {
                        result.add((Ticket) object);
                    }
                } else if (field.getType().equals(List.class)) {
                    List<String> list = (List<String>) field.get(object);
                    for (String str : list) {
                        if (str.equals(value)) {
                            result.add((Ticket) object);
                            break;
                        }
                    }
                } else {
                    String target = String.valueOf(field.get(object));
                    if (target.equals(value)) {
                        result.add((Ticket) object);
                    }
                }
            }
        }
    }

    /*
     *   Descriptions:
     *       1. Go through every field of target class and traverse every attribute name and attribute value.
     *       2. find the attribute and distinguish if it meet the requirement of user
     *       3. If we found the answer, add this object into the result List
     *    Input:
     *       term : name of field user provides
     *       value : value of the field user provides
     *       result : the List<User> for store the query result
     *       object : the User object we current processing
     * */
    public void reflectingUser(String term, String value, List<User> result, Object object) throws Exception {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
            if (name.equals(term)) {
                if (field.getType().equals(boolean.class)) {
                    if ((value.equals("false") && false == (boolean) field.get(object)) || (value.equals("true") && true == (boolean) field.get(object))) {
                        result.add((User) object);
                    }
                } else if (field.getType().equals(List.class)) {
                    List<String> list = (List<String>) field.get(object);
                    for (String str : list) {
                        if (str.equals(value)) {
                            result.add((User) object);
                            break;
                        }
                    }
                } else {
                    String target = String.valueOf(field.get(object));
                    if (target.equals(value)) {
                        result.add((User) object);
                    }
                }
            }
        }
    }
}
