package UberDesign.Strategy;

import UberDesign.Entity.Trip;

public class PeakHourPrice implements PriceCalculation{
    @Override
    public double calculatePrice(Trip trip) {
        return 0;
    }
}
