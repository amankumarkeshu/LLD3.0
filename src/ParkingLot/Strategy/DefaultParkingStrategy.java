package ParkingLot.Strategy;

import ParkingLot.Entity.ParkingSpot;
import ParkingLot.Entity.Vehicle;

import java.util.List;

public class DefaultParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot getParkingSpot(Vehicle vehicle, List<ParkingSpot> parkingSpotList) {

        for (int index= 0; index < parkingSpotList.size(); index++ ){
            ParkingSpot parkingSpot = parkingSpotList.get(index);

            if (parkingSpot.isAvailable() && parkingSpot.getParkingSpotType().equals(vehicle.getParkingSpotType())) {
                return  parkingSpot;
            }
        }
        return null;
    }
}
