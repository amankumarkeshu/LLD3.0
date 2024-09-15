package UberDesign.Manager;

import UberDesign.Entity.Driver;
import UberDesign.Entity.Location;
import UberDesign.Entity.Rider;
import UberDesign.Entity.Trip;
import UberDesign.Strategy.DriverMatchingStrategy;
import UberDesign.Strategy.PriceCalculation;

import java.util.HashMap;

public class TripManager {

    HashMap<Integer, Trip> tripHashMap;

    public static TripManager instance = null;

    private TripManager() {
        tripHashMap = new HashMap<>();
    }

    public static TripManager getInstance() {
        if (instance == null) {
            instance = new TripManager();
        }
        return instance;
    }

    public Trip createTrip(Rider rider, Location src, Location des) {

        int tripId = tripHashMap.size() +1 ;
        Trip trip = new Trip(tripId, rider, src , des);

        // Find the driver matching strategy
        DriverMatchingStrategy driverMatchingStrategy = StrategyManager.getDriverMatchingStrategy(trip);
        Driver driver = driverMatchingStrategy.findDriver(trip);
        if (driver == null) {
            System.out.println("Cannot find a driver");
            return trip;
        }
        trip.setDriver(driver);

        PriceCalculation priceCalculation = StrategyManager.getPriceCalculationStrategy(trip);
        double amount = priceCalculation.calculatePrice(trip);
        // Calculate the amount

        trip.setAmount(amount);

        return trip;
    }

    public void endTrip(Trip trip) {
        Driver driver = trip.getDriver();
        driver.setAvailable(true);
        DriverManager driverManager  = DriverManager.getInstance();
        driverManager.getDriverHashMap().replace(driver.getName(), driver);
        System.out.println("Trip ended for the rider: " + trip.getRider().getName());

    }

}
