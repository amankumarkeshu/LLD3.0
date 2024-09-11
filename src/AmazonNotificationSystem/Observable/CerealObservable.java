package AmazonNotificationSystem.Observable;

import AmazonNotificationSystem.Observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class CerealObservable implements StockObservable{
    List<StockObserver> observerList;

    int productCount;

    public CerealObservable() {
        this.productCount = 0;
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(StockObserver stockObserver) {
        System.out.println("Added observer for cereal ");
        observerList.add(stockObserver);

    }

    @Override
    public void removeObserver(StockObserver stockObserver) {
        System.out.println("Observer removed from the list");
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


        System.out.println("The updated product count of cereal is : " + productCount);
        if (productCount > 0 ) {
            this.productCount = productCount;
            notifyObservers();
        } else if (productCount < 0){
            System.out.println("Invalid product count for the Cereal");
        } else {
            this.productCount = productCount;
        }

    }
}
