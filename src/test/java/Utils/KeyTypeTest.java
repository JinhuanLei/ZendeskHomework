package Utils;

import static org.junit.Assert.*;

public class KeyTypeTest {
    public static void main(String args[]){
        for (KeyType e : KeyType.values()) {
            System.out.println(e.toString());
        }
    }
}