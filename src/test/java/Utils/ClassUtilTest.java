package Utils;

import Models.Organization;
import Models.Ticket;
import Models.User;
import Repositories.OrganizationRepository;
import Repositories.TicketRepository;
import Repositories.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ClassUtilTest {
    OrganizationRepository or;
    TicketRepository tr;
    UserRepository ur;
    ClassUtil cu;

    @Before
    public void before() throws Exception {
        or = new OrganizationRepository();
        tr = new TicketRepository();
        ur = new UserRepository();
        cu = new ClassUtil();
    }

    @Test
    public void testReflectingOrganizationWithSingleResult1() {
        List<Organization> result = new ArrayList<>();
        List<Organization> data = or.getOrganizationList();
        try {
            cu.reflectingOrganization("_id", "101", result, data.get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1, result.size());
        Assert.assertSame(data.get(0), result.get(0));
    }

    @Test
    public void testReflectingOrganizationWithSingleResult2() {
        List<Organization> result = new ArrayList<>();
        List<Organization> data = or.getOrganizationList();
        try {
            cu.reflectingOrganization("created_at", "2016-04-07T08:21:44 -10:00", result, data.get(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1, result.size());
        Assert.assertSame(data.get(1), result.get(0));
    }

    @Test
    public void testReflectingOrganizationWithSingleResult3() {
        List<Organization> result = new ArrayList<>();
        List<Organization> data = or.getOrganizationList();
        try {
            cu.reflectingOrganization("shared_tickets", "false", result, data.get(2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1, result.size());
        Assert.assertSame(data.get(2), result.get(0));
    }

    @Test
    public void testReflectingOrganizationWithSingleResult4() {
        List<Organization> result = new ArrayList<>();
        List<Organization> data = or.getOrganizationList();
        try {
            cu.reflectingOrganization("tags", "Hendricks", result, data.get(3));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1, result.size());
        Assert.assertSame(data.get(3), result.get(0));
    }

    @Test
    public void testReflectingOrganizationWithMultipleResult1() {
        List<Organization> result = new ArrayList<>();
        List<Organization> data = or.getOrganizationList();
        for (Organization o : data) {
            try {
                cu.reflectingOrganization("tags", "Hendricks", result, o);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Assert.assertNotEquals(0, result.size());
    }

    @Test
    public void testReflectingOrganizationWithEmptyResult1() {
        List<Organization> result = new ArrayList<>();
        List<Organization> data = or.getOrganizationList();
        for (Organization o : data) {
            try {
                cu.reflectingOrganization("_id", "-5", result, o);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testGetReflectingTicketWithSingleResult1() {
        List<Ticket> result = new ArrayList<>();
        List<Ticket> data = tr.getTicketList();
        for (Ticket t : data) {
            try {
                cu.reflectingTicket("_id", "436bf9b0-1147-4c0a-8439-6f79833bff5b", result, t);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void testGetReflectingTicketWithSingleResult2() {
        List<Ticket> result = new ArrayList<>();
        Ticket test = new Ticket();
        test.setDescription("");
        try {
            cu.reflectingTicket("description", "", result, test);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void testGetReflectingTicketWithMultipleResult1() {
        List<Ticket> result = new ArrayList<>();
        List<Ticket> data = tr.getTicketList();
        for(Ticket t : data){
            try {
                cu.reflectingTicket("organization_id", "112", result, t);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Assert.assertNotEquals(0, result.size());
    }

    @Test
    public void testGetReflectingTicketWithEmptyResult1() {
        List<Ticket> result = new ArrayList<>();
        List<Ticket> data = tr.getTicketList();
        for(Ticket t : data){
            try {
                cu.reflectingTicket("description", "Nostrud", result, t);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testReflectingUserWithSingleResult1() {
        List<User> result = new ArrayList<>();
        List<User> data = ur.getUserList();
        for(User u : data){
            try {
                cu.reflectingUser("url", "http://initech.zendesk.com/api/v2/users/1.json", result, u);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void testReflectingUserWithMultipleResult1() {
            List<User> result = new ArrayList<>();
        List<User> data = ur.getUserList();
        for(User u : data){
            try {
                cu.reflectingUser("locale", "en-AU", result, u);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Assert.assertNotEquals(0, result.size());
    }

    @Test
    public void testReflectingUserWithEmptyResult1() {
        List<User> result = new ArrayList<>();
        List<User> data = ur.getUserList();
        for(User u : data){
            try {
                cu.reflectingUser("_id", "0", result, u);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Assert.assertEquals(0, result.size());
    }
}