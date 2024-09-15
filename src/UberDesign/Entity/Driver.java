package UberDesign.Entity;

public class Driver {

    String name;
    double rating;

    boolean isAvailable;

    public Driver(String name) {
        this.name = name;
        this.isAvailable = true;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
