package UberDesign.Strategy;

import UberDesign.Entity.Location;
import UberDesign.Entity.Trip;

public class DefaultPriceCalulation implements  PriceCalculation {
    @Override
    public double calculatePrice(Trip trip) {
       Location src = trip.getSrc();
       Location des = trip.getDes();

       double x_cordinate =  (src.getLat() - des.getLat() ) * (src.getLat() - des.getLat());
       double y_cordinate =  (src.getLongitude() - des.getLongitude() ) * (src.getLongitude() - des.getLongitude());

       double distance = Math.sqrt(x_cordinate + y_cordinate);
       double amount = distance * 10;

       System.out.println("Distance travelled is : " + distance );
       System.out.println("Total amount  is : " + amount );

        return amount;
    }
}
