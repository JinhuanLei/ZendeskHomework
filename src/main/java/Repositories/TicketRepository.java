package Repositories;

import Models.Ticket;
import Utils.ClassUtil;
import Utils.InputUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
 *   The TicketRepository can communicating with the Ticket database
 * */
public class TicketRepository {
    private List<Ticket> ticketList;
    public TicketRepository(){
        init();
    }

    /*
     *   init the data structures and loading data from .json file to a List<Ticket>
     * */
    private void init() {
        InputStream inputStream = this.getClass().getResourceAsStream("tickets.json");
        InputStreamReader reader = new InputStreamReader(inputStream);
        Gson gson = new Gson();
        ticketList = gson.fromJson(reader, new TypeToken<List<Ticket>>() {
        }.getType());
        try {
            inputStream.close();
            reader.close();
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
    public List<Ticket> queryThings(String term, String value) throws Exception {
        List<Ticket> result = new ArrayList<>();
        for (Ticket o : ticketList) {
            ClassUtil.reflectingTicket(term, value, result, o);
        }
        for (Ticket o : result) {
            System.out.println(o);
        }
        System.out.println("Total " + result.size() + " Item Found");
        InputUtil.getEnterKey();
        return result;
    }

    /*
     *  Test Method
     * */
    public static void main(String args[]){
        TicketRepository t = new TicketRepository();
        System.out.println(t.ticketList.get(0));
    }
}
