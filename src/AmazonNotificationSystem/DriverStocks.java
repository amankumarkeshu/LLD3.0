package AmazonNotificationSystem;

import AmazonNotificationSystem.Observable.CerealObservable;
import AmazonNotificationSystem.Observable.IphoneObserverable;
import AmazonNotificationSystem.Observable.StockObservable;
import AmazonNotificationSystem.Observer.EmailObserver;
import AmazonNotificationSystem.Observer.MobileObserver;
import AmazonNotificationSystem.Observer.StockObserver;

public class DriverStocks {
    public static void main(String[] args) {

        StockObservable iphone = new IphoneObserverable();
        StockObservable cereal = new CerealObservable();

        StockObserver akash = new MobileObserver("Akash", iphone);
        StockObserver digvijayEmail = new EmailObserver("digvijay@gmailcom", iphone);
        StockObserver digvijayMobile = new MobileObserver("digvijay@mobile", cereal);
        StockObserver yuvraj = new EmailObserver("yuvraj@gmail.com", cereal);


        // Add observers to the iphone observable
        iphone.addObserver(akash);
        iphone.addObserver(digvijayEmail);

        cereal.addObserver(digvijayMobile);
        cereal.addObserver(yuvraj);

        iphone.setData(100);
        cereal.setData(20);

        iphone.removeObserver(akash);

        iphone.setData(0);

        iphone.setData(500);

    }
}
