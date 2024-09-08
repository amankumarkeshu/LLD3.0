package ParkingLot.Entity;

public class Ticket {

    int ticketId;

    Vehicle vehicle;

    long entryTime;
    long exitTime;

    double price;


    ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = System.currentTimeMillis();
        TicketManager ticketManager = TicketManager.getInstance();
        int size = ticketManager.ticketMap.size();
        this.ticketId = size;
    }

    public int getTicketId() {
        return ticketId;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public static Ticket createTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        Ticket ticket = new Ticket(vehicle, parkingSpot);
        TicketManager.instance.ticketMap.put(ticket.getTicketId(), ticket);
        return ticket;
    }

    public static double priceCalculation(Ticket ticket) {

        long duration = 5;

        ParkingSpot parkingSpot = ticket.getParkingSpot();

        int pricePerHour = parkingSpot.getParkingSpotType().getPrice();
        double amount = duration * pricePerHour;
        System.out.println("Total amount to be paid for duration = " + duration + "is : " + amount);
        ticket.setPrice(amount);
        return amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
