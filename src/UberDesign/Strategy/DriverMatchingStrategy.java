package UberDesign.Strategy;

import UberDesign.Entity.Driver;
import UberDesign.Entity.Trip;

public interface DriverMatchingStrategy {

    public Driver findDriver(Trip trip);
}
