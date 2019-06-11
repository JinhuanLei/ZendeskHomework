package Controllers;

import Utils.ModelType;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class QueryControllerTest {
    private QueryController qc;

    @Before
    public void before() {
        qc = new QueryController();
    }

    @Test
    public void testQueryThingsWithValidInput1(){
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qc.queryThings(ModelType.USER, "_id", "1");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
    }



    @Test
    public void testQueryThingsWithValidInput2() {
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qc.queryThings(ModelType.ORGANIZATION, "domain_names", "anixang.com");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testQueryThingsWithValidInput3() {
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qc.queryThings(ModelType.TICKET, "via", "web");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testQueryThingsWithInValidInput1() {
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qc.queryThings(ModelType.USER, "", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testQueryThingsWithInValidInput2() {
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qc.queryThings(null, "", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
    }

}