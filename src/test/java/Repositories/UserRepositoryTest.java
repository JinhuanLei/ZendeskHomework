package Repositories;

import Models.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryTest {

    UserRepository ur;

    @Before
    public void before() {
        ur = new UserRepository();
    }

    @Test
    public void testQueryThingsForInteger1() {
        List<User> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            ur.queryUser(list, "_id", "1");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testQueryThingsForInteger2() {
        List<User> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            ur.queryUser(list, "_id", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testQueryThingsForString1() {
        List<User> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            ur.queryUser(list, "timezone", "Sri Lanka");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertNotEquals(0, list.size());
    }

    @Test
    public void testQueryThingsForString2() {
        List<User> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            ur.queryUser(list, "timezone", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testQueryThingsForBoolean1() {
        List<User> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            ur.queryUser(list, "active", "true");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertNotEquals(0, list.size());
    }

    @Test
    public void testQueryThingsForBoolean2() {
        List<User> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            ur.queryUser(list, "active", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testQueryThingsForList1() {
        List<User> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            ur.queryUser(list, "tags", "Springville");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertNotEquals(0, list.size());
    }

    @Test
    public void testQueryThingsForList2() {
        List<User> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            ur.queryUser(list, "tags", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testQueryThingsForInvalidInput1() {
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            ur.queryUser(null, "_id", "5");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testQueryThingsForInvalidInput2() {
        List<User> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            ur.queryUser(list, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

}