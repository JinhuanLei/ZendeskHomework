package Services;

import Models.Organization;
import Models.Ticket;
import Models.User;
import Repositories.OrganizationRepository;
import Repositories.TicketRepository;
import Repositories.UserRepository;

import java.util.List;

/*
 *   The QueryService handles the query requests from Controller and responsible for communicating with repositories
 * */
public class QueryService {
    private OrganizationRepository qr;
    private TicketRepository tr;
    private UserRepository ur;
    public QueryService(){
        qr  = new OrganizationRepository();
        tr = new TicketRepository();
        ur = new UserRepository();
    }
    public void queryOrganization(List<Organization> result, String term, String value) throws Exception {
        qr.queryThings(result, term, value);
    }

    public void queryTicket(List<Ticket> result, String term, String value) throws Exception {
        tr.queryThings(result, term, value);
    }

    public void queryUser(List<User> result, String term, String value) throws Exception {
        ur.queryThings(result, term, value);
    }
}
