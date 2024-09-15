package UberDesign.Manager;

import UberDesign.Entity.Rider;

import javax.naming.ldap.Rdn;
import java.util.HashMap;

public class RiderManager {


    HashMap<String , Rider> riderHashMap;

    private RiderManager() {
        riderHashMap = new HashMap<>();
    }

    public static RiderManager instance = null;

    public static RiderManager getInstance(){
        if (instance == null) {
            instance = new RiderManager();
        }
        return instance;
    }

    public void addRider(Rider rider) {
        riderHashMap.put(rider.getName(), rider);
        System.out.println("Added rider to the rider list: "+ rider.getName());
    }
    public void removeRider(Rider rider) {
        riderHashMap.remove(rider.getName());
    }
}
