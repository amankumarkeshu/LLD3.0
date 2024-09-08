package ParkingLot;

import ParkingLot.Entity.ParkingLot;
import ParkingLot.Entity.Ticket;
import ParkingLot.Entity.Vehicle;
import ParkingLot.Enums.ParkingSpotType;
import ParkingLot.Factory.VehicleFactory;
import ParkingLot.Strategy.CashPayment;
import ParkingLot.Strategy.DefaultParkingStrategy;
import ParkingLot.Strategy.PaymentStrategy;

public class DriverParkingLot {
    public static void main(String []args){

        // 1. Have a parking lot ( it has some x spots for each vehicle type)
        // 2. Support parking for different vehicle types each with different cost
        // 3. Park and Vacate the vehicle
        // 4. Generate ticket
        // 5. Price calculation
        // 6. Do the payment
        // 7. Have different parking strategies
        // 8. Different payment strategies

        // Good coding design which is following My solid principles , use different design patterns

        // 9. Entraces and exit gates are just my intermediate steps ( enter gate -> parking and generate ticket)

        int bikeCount = 5, carCount = 1, truckCount = 3;
        ParkingLot parkingLot = new ParkingLot(bikeCount, carCount, truckCount);

        Vehicle splendor = VehicleFactory.createVehicle("KA53A1234", ParkingSpotType.BIKE);
        Vehicle passionpro =VehicleFactory.createVehicle("KA53A1111", ParkingSpotType.BIKE);
        Vehicle meteor = VehicleFactory.createVehicle("KA53A1112", ParkingSpotType.BIKE);
        Vehicle interceptor = VehicleFactory.createVehicle("KA53A1113", ParkingSpotType.BIKE);
        Vehicle yamaha = VehicleFactory.createVehicle("KA53A1114", ParkingSpotType.BIKE);


        Vehicle car = VehicleFactory.createVehicle("KA53A1235", ParkingSpotType.CAR);
        Vehicle luxuryCar = VehicleFactory.createVehicle("KA53A1236", ParkingSpotType.CAR);


        Ticket carTicket = parkingLot.parkVehicleAndGenerateTicket(car, new DefaultParkingStrategy());
        parkingLot.parkVehicleAndGenerateTicket(luxuryCar, new DefaultParkingStrategy());


        double amount = Ticket.priceCalculation(carTicket);
        parkingLot.vacateParking(car);

        PaymentStrategy cashPayment = new CashPayment();
        cashPayment.payAmount(amount);


    }
}
