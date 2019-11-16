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
public class QueryService implements Service {
    private OrganizationRepository qr;
    private TicketRepository tr;
    private UserRepository ur;

    public QueryService() {
        qr = new OrganizationRepository();
        tr = new TicketRepository();
        ur = new UserRepository();
    }

    @Override
    public void queryOrganization(List<Organization> result, String term, String value) throws Exception {
        qr.queryOrganizations(result, term, value);
    }

    @Override
    public void queryTicket(List<Ticket> result, String term, String value) throws Exception {
        tr.queryTickets(result, term, value);
    }

    @Override
    public void queryUser(List<User> result, String term, String value) throws Exception {
        ur.queryUser(result, term, value);
    }
}
