package UberDesign.Entity;

public class Location {

    double lat;
    double longitude;

    public Location(double lat, double longitude) {
        this.lat = lat;
        this.longitude = longitude;
    }

    public double getLat() {
        return lat;
    }

    public double getLongitude() {
        return longitude;
    }
}
