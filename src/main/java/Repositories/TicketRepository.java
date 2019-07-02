package Repositories;

import Models.Ticket;
import Models.User;
import Utils.ClassUtil;
import Utils.InputUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
/*
 *   The TicketRepository can communicating with the Ticket database
 * */
public class TicketRepository extends BaseRepository{
    private List<Ticket> ticketList;
    private InputUtil iu;
    private ClassUtil cu;
    private static final String RESOURCE_NAME = "tickets.json";
    private InputStreamReader isr;
    public TicketRepository(){
        loadReasorcesReader();
        iu = new InputUtil();
        cu = new ClassUtil();
    }

    @Override
    protected String getResourceName(){
        return RESOURCE_NAME;
    }

    public void loadReasorcesReader() {
        isr = init();
        Gson gson = new Gson();
        ticketList = gson.fromJson(isr, new TypeToken<List<Ticket>>() {
        }.getType());
        try {
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     *   Query the ticket by providing its attributes and value.
     *   Input:
     *       term : attributes of tickets
     *       value : the value of the term we care of tickets
     *   Output:
     *       List<Ticket> : All the result will be put in a List
     * */
    public List<Ticket> queryThings(List result, String term, String value) throws Exception {
        if(result == null || term == null || value == null){
            return result;
        }
        for (Ticket o : ticketList) {
            cu.reflectingTicket(term, value, result, o);
        }
        for (Ticket o : (List<Ticket>)result) {
            System.out.println(o);
        }
        System.out.println("Total " + result.size() + " Item Found");
        iu.getEnterKey();
        return result;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    /*
     *  Test Method
     * */
    public static void main(String args[]){
        TicketRepository t = new TicketRepository();
        System.out.println(t.ticketList.get(0));
    }
}
