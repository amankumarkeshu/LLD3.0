package UberDesign.Factory;

import UberDesign.Entity.Driver;
import UberDesign.Entity.Rider;

public class Factory {

    public static Rider createRider(String name) {
        return new Rider(name);
    }

    public static Driver createDriver(String name){
        return new Driver(name);

    }
}
