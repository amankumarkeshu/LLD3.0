package UberDesign.Strategy;

import UberDesign.Entity.Driver;
import UberDesign.Entity.Trip;
import UberDesign.Manager.DriverManager;

public class DefaultDriverMatching implements DriverMatchingStrategy {
    @Override
    public Driver findDriver(Trip trip) {
        DriverManager driverManager = DriverManager.getInstance();

        for(Driver driver : driverManager.getDriverHashMap().values()) {
            if (driver.isAvailable()) {
                driver.setAvailable(false);
                driverManager.getDriverHashMap().replace(driver.getName(), driver);
                System.out.println("Found available driver: " + driver.getName());
                return driver;
            }
        }
        System.out.println("No drivers available");
        return null;
    }
}
