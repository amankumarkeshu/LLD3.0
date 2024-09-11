package AmazonNotificationSystem.Observer;

import AmazonNotificationSystem.Observable.StockObservable;

public class MobileObserver implements StockObserver{

    String username;

    StockObservable stockObservable;

    public MobileObserver(String username, StockObservable stockObservable) {
        this.username = username;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendPopup(stockObservable.getData());
    }

    private void sendPopup(int productCount) {
        System.out.println("User notified via mobile phone" + username + ". Also the product count is: " + productCount);
    }
}
