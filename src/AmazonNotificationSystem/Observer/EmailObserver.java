package AmazonNotificationSystem.Observer;

import AmazonNotificationSystem.Observable.StockObservable;

public class EmailObserver implements StockObserver {

    String email;

    StockObservable stockObservable;

    public EmailObserver(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(stockObservable.getData());

    }
    private void sendEmail(int productCount) {
        System.out.println("Email sent to the person with email : " + email + ". Also the product count is: " + productCount);
    }
}
