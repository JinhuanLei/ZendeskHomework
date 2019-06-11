package Repositories;

import Models.Organization;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class OrganizationRepositoryTest {
    OrganizationRepository or;

    @Before
    public void before() {
        or = new OrganizationRepository();
    }

    @Test
    public void testQueryThingsForId1() {
        List<Organization> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            or.queryThings(list, "_id", "101");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testQueryThingsForId2() {
        List<Organization> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            or.queryThings(list, "_id", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testQueryThingsForString() {
        List<Organization> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            or.queryThings(list, "url", "http://initech.zendesk.com/api/v2/organizations/105.json");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testQueryThingsForList() {
        List<Organization> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            or.queryThings(list, "domain_names", "Jordan");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertNotEquals(0, list.size());
    }

    @Test
    public void testQueryThingsForBoolean() {
        List<Organization> list = new ArrayList<>();
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            or.queryThings(list, "shared_tickets", "false");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertNotEquals(0, list.size());
    }

}