package Repositories;

import Models.Ticket;
import Utils.ClassUtil;
import Utils.InputUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TicketRepository {
    List<Ticket> ticketList;
    public TicketRepository(){
        init();
    }
    public void init() {
        InputStream inputStream = this.getClass().getResourceAsStream("/tickets.json");
        InputStreamReader reader = new InputStreamReader(inputStream);
        Gson gson = new Gson();
        ticketList = gson.fromJson(reader, new TypeToken<List<Ticket>>() {
        }.getType());
    }

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

    public static void main(String args[]) throws IOException {
        TicketRepository t = new TicketRepository();
        System.out.println(t.ticketList.get(0));
    }
}
