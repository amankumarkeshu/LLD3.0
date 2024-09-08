package ParkingLot.Entity;

import ParkingLot.Enums.ParkingSpotType;

public class CarParkingSpot extends  ParkingSpot{
    public CarParkingSpot(int parkingSpotId, ParkingSpotType parkingSpotType) {
        super(parkingSpotId, parkingSpotType);
    }

    @Override
    public ParkingSpotType getParkingSpotType() {
        return ParkingSpotType.CAR;
    }
}
