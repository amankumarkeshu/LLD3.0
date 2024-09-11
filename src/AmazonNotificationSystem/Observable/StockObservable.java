package AmazonNotificationSystem.Observable;

import AmazonNotificationSystem.Observer.StockObserver;

public interface StockObservable {

    public void addObserver(StockObserver stockObserver);

    public void removeObserver(StockObserver stockObserver);

    public void notifyObservers();

    public int getData();

    public void setData(int productCount);


}
