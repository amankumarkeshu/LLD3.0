package UberDesign.Manager;

import UberDesign.Entity.Driver;

import java.util.HashMap;

// Singleton
public class DriverManager {

    HashMap<String, Driver> driverHashMap;

    private DriverManager(){
        driverHashMap = new HashMap<>();
    }

    public static DriverManager instance = null;

    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    public void addDriver(Driver driver) {
        driverHashMap.put(driver.getName(), driver);
        System.out.println("Added driver to the drivers list");
    }

    public HashMap<String, Driver> getDriverHashMap() {
        return driverHashMap;
    }

    public void removeDriver(Driver driver) {
        driverHashMap.remove(driver.getName());
    }

}
