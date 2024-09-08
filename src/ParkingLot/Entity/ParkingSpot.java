package ParkingLot.Entity;

import ParkingLot.Enums.ParkingSpotType;

public abstract class ParkingSpot {

    int parkingSpotId;
    boolean isAvailable;

    ParkingSpotType parkingSpotType;

    public ParkingSpot(int parkingSpotId, ParkingSpotType parkingSpotType) {
        this.parkingSpotId = parkingSpotId;
        this.parkingSpotType = parkingSpotType;
        this.isAvailable = true;
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public abstract ParkingSpotType getParkingSpotType();
}


