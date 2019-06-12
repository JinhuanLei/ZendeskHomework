package Services;

import Models.Organization;
import Models.Ticket;
import Models.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class QueryServiceTest {
    QueryService qs;

    @Before
    public void before() {
        qs = new QueryService();
    }

    @Test
    public void testQueryOrganizationWithInvalidInput1() {
        List<Organization> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qs.queryOrganization(list, "", "104");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }


    @Test
    public void testQueryOrganizationWithInvalidInput2() {
        List<Organization> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qs.queryOrganization(list, "_id", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testQueryOrganizationWithInvalidInput3() {
        List<Organization> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qs.queryOrganization(list, "", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testQueryOrganizationWithValidInput1() {
        List<Organization> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qs.queryOrganization(list, "_id", "104");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testQueryTicketWithValidInput1() {
        List<Ticket> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qs.queryTicket(list, "_id", "436bf9b0-1147-4c0a-8439-6f79833bff5b");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testQueryTicketWithInvalidInpit1() {
        List<Ticket> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qs.queryTicket(list, "_id", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testQueryTicketWithInvalidInpit2() {
        List<Ticket> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qs.queryTicket(list, "", "436bf9b0-1147-4c0a-8439-6f79833bff5b");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testQueryTicketWithInvalidInpit3() {
        List<Ticket> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qs.queryTicket(list, "", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }


    @Test
    public void testQueryUserWithValidInput1() {
        List<User> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qs.queryUser(list, "_id", "33");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testQueryUserWithValidInput2() {
        List<User> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qs.queryUser(list, "active", "false");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertNotEquals(0, list.size());
    }

    @Test
    public void testQueryUserWithInvalidInput1() {
        List<User> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qs.queryUser(list, "active", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testQueryUserWithInvalidInput2() {
        List<User> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            qs.queryUser(list, "", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }
}