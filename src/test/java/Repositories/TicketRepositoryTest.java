package Repositories;

import Models.Ticket;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class TicketRepositoryTest {

    TicketRepository tr;

    @Before
    public void before() {
        tr = new TicketRepository();
    }

    @Test
    public void queryThingsForString1() {
        List<Ticket> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            tr.queryThings(list, "_id", "df1a642a-e704-4556-af79-98a63b59401d");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void queryThingsForString2() {
        List<Ticket> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            tr.queryThings(list, "description", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void queryThingsForInteger1() {
        List<Ticket> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            tr.queryThings(list, "submitter_id", "38");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertNotEquals(0, list.size());
    }

    @Test
    public void queryThingsForInteger2() {
        List<Ticket> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            tr.queryThings(list, "submitter_id", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void queryThingsForBoolean1() {
        List<Ticket> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            tr.queryThings(list, "has_incidents", "false");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertNotEquals(0, list.size());
    }

    @Test
    public void queryThingsForBoolean2() {
        List<Ticket> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            tr.queryThings(list, "has_incidents", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void queryThingsForList1() {
        List<Ticket> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            tr.queryThings(list, "tags", "South Dakota");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertNotEquals(0, list.size());
    }

    @Test
    public void queryThingsForList2() {
        List<Ticket> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            tr.queryThings(list, "tags", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void queryThingsForInvalidInput1() {
        List<Ticket> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            tr.queryThings(list, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void queryThingsForInvalidInput2() {
        List<Ticket> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            tr.queryThings(null, "_id", "436bf9b0-1147-4c0a-8439-6f79833bff5b");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

}