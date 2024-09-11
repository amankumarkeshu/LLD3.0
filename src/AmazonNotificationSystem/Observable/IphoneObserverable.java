package AmazonNotificationSystem.Observable;

import AmazonNotificationSystem.Observer.StockObserver;
import ParkingLot.Enums.ParkingSpotType;

import java.util.ArrayList;
import java.util.List;

public class IphoneObserverable implements StockObservable{

    List<StockObserver> observerList;

    int productCount =0;

    public IphoneObserverable() {
        this.productCount = 0;
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(StockObserver stockObserver) {
        System.out.println("Added observer for iphone");
        observerList.add(stockObserver);

    }

    @Override
    public void removeObserver(StockObserver stockObserver) {
        System.out.println("Removed observer for iphone");
        observerList.remove(stockObserver);

    }

    @Override
    public void notifyObservers() {
        for(StockObserver stockObserver : observerList) {
            stockObserver.update();
        }

    }

    @Override
    public int getData() {
        return productCount;
    }

    @Override
    public void setData(int productCount) {

        if (productCount > 0 ) {
            this.productCount = productCount;
            notifyObservers();
        } else if (productCount <0 ){
            System.out.println("Invalid product count for the Iphone");
        } else {
            this.productCount = productCount;
        }

    }
}
