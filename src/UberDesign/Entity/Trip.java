package UberDesign.Entity;

public class Trip {

    int id;
    Rider rider;
    Driver driver;
    Location src;
    Location des;
    double amount;

    public Trip(int id, Rider rider,  Location src, Location des) {
        this.id = id;
        this.rider = rider;
        this.src = src;
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Location getSrc() {
        return src;
    }

    public Location getDes() {
        return des;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Rider getRider() {
        return rider;
    }

    public Driver getDriver() {
        return driver;
    }
}
