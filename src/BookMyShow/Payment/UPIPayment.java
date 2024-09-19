package BookMyShow.Payment;

public class UPIPayment implements Payment{
    @Override
    public void payAmount(double amount) {
        System.out.println("Making a payment via UPI: " + amount);
    }
}
