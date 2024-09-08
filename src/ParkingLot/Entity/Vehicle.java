package ParkingLot.Entity;

import ParkingLot.Enums.ParkingSpotType;

public class Vehicle {

    String vehNumber;
    ParkingSpotType parkingSpotType;

    public String getVehNumber() {
        return vehNumber;
    }


    public Vehicle(String vehNumber, ParkingSpotType parkingSpotType) {
        this.vehNumber = vehNumber;
        this.parkingSpotType = parkingSpotType;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

}
