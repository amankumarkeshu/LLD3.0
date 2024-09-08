package ParkingLot.Entity;

import ParkingLot.Enums.ParkingSpotType;
import ParkingLot.Strategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {

    List<ParkingSpot> parkingSpotList;
    Map<Vehicle, ParkingSpot > vehicleParkingSpotMap;

    public ParkingLot( int bikeSpots, int carSpots, int truckSpots) {
        this.parkingSpotList = new ArrayList<>();
        this.vehicleParkingSpotMap = new HashMap<>();
        int parkingSpotsId = 101;
        for(int index = 0; index < bikeSpots; index++ ) {
            ParkingSpot parkingSpot = new BikeParkingSpot(parkingSpotsId++, ParkingSpotType.BIKE);
            parkingSpotList.add(parkingSpot);
        }

        for(int index = 0; index < carSpots; index++ ) {
            ParkingSpot parkingSpot = new CarParkingSpot(parkingSpotsId++, ParkingSpotType.CAR);
            parkingSpotList.add(parkingSpot);
        }

        for(int index = 0; index < truckSpots; index++ ) {
            ParkingSpot parkingSpot = new TruckParkingSpot(parkingSpotsId++, ParkingSpotType.TRUCK);
            parkingSpotList.add(parkingSpot);
        }
    }

    public Ticket parkVehicleAndGenerateTicket(Vehicle vehicle , ParkingStrategy parkingStrategy) {
        ParkingSpot parkingSpot = parkingStrategy.getParkingSpot(vehicle, parkingSpotList);

        if ( parkingSpot == null) {
            System.out.println("no parking spots available for this vehcile " + vehicle.getVehNumber());
            return null;
        }
        parkingSpot.setAvailable(false);
        updateParkingSpot(parkingSpot);
        vehicleParkingSpotMap.put(vehicle, parkingSpot);
        System.out.println("Vehicle parked Successfully : " + vehicle.getVehNumber());

        Ticket ticket = Ticket.createTicket(vehicle, parkingSpot);
        return ticket;


    }

    private void updateParkingSpot(ParkingSpot parkingSpot) {
        for( int index = 0; index < parkingSpotList.size(); index++){
            ParkingSpot curParkingSpot = parkingSpotList.get(index);

            if (curParkingSpot.getParkingSpotId() == parkingSpot.getParkingSpotId()){
                parkingSpotList.set(index, parkingSpot);
            }
        }
    }


    public void vacateParking(Vehicle vehicle) {

        ParkingSpot parkingSpot = vehicleParkingSpotMap.get(vehicle);
        parkingSpot.setAvailable(true);
        updateParkingSpot(parkingSpot);
        System.out.println("Vehicle : " + vehicle.getVehNumber() + " is successfully vacated");


    }

}


// KA1234 - > 1

