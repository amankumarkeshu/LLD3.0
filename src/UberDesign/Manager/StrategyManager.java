package UberDesign.Manager;

import UberDesign.Entity.Trip;
import UberDesign.Strategy.DefaultDriverMatching;
import UberDesign.Strategy.DefaultPriceCalulation;
import UberDesign.Strategy.DriverMatchingStrategy;
import UberDesign.Strategy.PriceCalculation;

public class StrategyManager {

    public static DriverMatchingStrategy getDriverMatchingStrategy(Trip trip) {

        // if the time of the start trip is 11pm initialise the rating based system
        return new DefaultDriverMatching();
    }

    public static PriceCalculation getPriceCalculationStrategy(Trip trip)  {
        return new DefaultPriceCalulation();
    }

}
