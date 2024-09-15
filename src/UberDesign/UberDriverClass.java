package UberDesign;

import UberDesign.Entity.Driver;
import UberDesign.Entity.Location;
import UberDesign.Entity.Rider;
import UberDesign.Entity.Trip;
import UberDesign.Factory.Factory;
import UberDesign.Manager.DriverManager;
import UberDesign.Manager.RiderManager;
import UberDesign.Manager.TripManager;
import UberDesign.Strategy.CashPayment;
import UberDesign.Strategy.PaymentStrategy;

public class UberDriverClass {
    public static void main(String [] args){


        // Create a list of drivers
        Driver raj = Factory.createDriver("Raj");
        Driver akash = Factory.createDriver("Akash");

        DriverManager driverManager = DriverManager.getInstance();
        driverManager.addDriver(raj);
        driverManager.addDriver(akash);

        // Create a list of riders
        Rider mehak = Factory.createRider("Mehak");
        Rider digvijay = Factory.createRider("Digvijay");

        RiderManager riderManager = RiderManager.getInstance();
        riderManager.addRider(mehak);
        riderManager.addRider(digvijay);

        // Create the src and destination locations
        Location src = new Location(10.0, 30.0);
        Location des = new Location(10.0, 80.0);


        // Create a trip for the user , We should be able to search for the driver and book a trip)
        TripManager tripManager = TripManager.getInstance();
        Trip tripMehak = tripManager.createTrip(mehak, src, des);


        // End the trip and make the payment
        tripManager.endTrip(tripMehak);

        // Take the user defined payment mode

        PaymentStrategy paymentMode = new CashPayment();

        paymentMode.payAmount(tripMehak.getAmount());




    }
}
