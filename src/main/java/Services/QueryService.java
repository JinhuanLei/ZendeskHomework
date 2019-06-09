package Services;

import Repositories.OrganizationRepository;
import Repositories.TicketRepository;
import Repositories.UserRepository;
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
    public void queryOrganization(String term, String value) throws Exception {
        qr.queryThings(term, value);
    }

    public void queryTicket(String term, String value) throws Exception {
        tr.queryThings(term, value);
    }

    public void queryUser(String term, String value) throws Exception {
        ur.queryThings(term, value);
    }
}
