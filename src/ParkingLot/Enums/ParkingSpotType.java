package ParkingLot.Enums;

public enum ParkingSpotType {

    BIKE("BIKE", 10),
    CAR("CAR", 20),
    TRUCK("TRUCK", 50);

    int price;
    String name;



    ParkingSpotType( String name, int price) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
