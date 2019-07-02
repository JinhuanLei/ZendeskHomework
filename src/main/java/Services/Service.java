package Services;

import Models.Organization;
import Models.Ticket;
import Models.User;

import java.util.List;

/*
 * Interface for defining the methods of services to query from Organization, Ticket, User
 * */
public interface Service {
    public void queryOrganization(List<Organization> result, String term, String value) throws Exception;

    public void queryTicket(List<Ticket> result, String term, String value) throws Exception;

    public void queryUser(List<User> result, String term, String value) throws Exception;
}
