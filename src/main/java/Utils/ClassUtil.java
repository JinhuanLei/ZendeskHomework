package Utils;

import Models.Organization;
import Models.Ticket;
import Models.User;

import java.lang.reflect.Field;
import java.util.List;

public class ClassUtil {
    public static void reflectingOrganization(String term, String value, List<Organization> result, Object object) throws Exception {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
//            System.out.println("Param Name：" + name);
//            System.out.println("Param Value：" + field.get(object));
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

    public static void reflectingTicket(String term, String value, List<Ticket> result, Object object) throws Exception {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
//            System.out.println("Param Name：" + name);
//            System.out.println("Param Value：" + field.get(object));
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

    public static void reflectingUser(String term, String value, List<User> result, Object object) throws Exception {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
//            System.out.println("Param Name：" + name);
//            System.out.println("Param Value：" + field.get(object));
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
