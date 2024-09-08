package ParkingLot.Factory;

import ParkingLot.Entity.Vehicle;
import ParkingLot.Enums.ParkingSpotType;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehNum, ParkingSpotType parkingSpotType) {
        return new Vehicle(vehNum, parkingSpotType);
    }
}
