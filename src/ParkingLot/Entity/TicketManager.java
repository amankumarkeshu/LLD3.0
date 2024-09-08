package ParkingLot.Entity;

import java.util.HashMap;
import java.util.Map;

public class TicketManager {

    Map<Integer, Ticket> ticketMap;

    public static TicketManager instance;

    public static TicketManager getInstance() {
        if (instance == null) {
            instance = new TicketManager();
        }
        return instance;
    }


    private TicketManager() {
        this.ticketMap = new HashMap<>();
    }

    public static Ticket getTicket(int ticketId) {
         if (instance.ticketMap.containsKey(ticketId)){
             return instance.ticketMap.get(ticketId);
         }
         System.out.println("No tickets found for this ticket id");
         return  null;
    }

}
