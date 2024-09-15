package UberDesign.Strategy;

import UberDesign.Entity.Trip;

public interface PriceCalculation {

    public double calculatePrice(Trip trip);
}
