package Utils;

import static org.junit.Assert.*;

public class ModelTypeTest {
    public static void main(String args[]){
        for (ModelType e : ModelType.values()) {
            System.out.println(e.toString());
        }
    }
}