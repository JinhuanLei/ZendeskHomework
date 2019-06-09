package Services;

import Models.Organization;
import Repositories.OrganizationRepository;
import Repositories.TicketRepository;
import Repositories.UserRepository;

import java.util.List;

public class QueryService {
    OrganizationRepository qr;
    TicketRepository tr;
    UserRepository ur;
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
