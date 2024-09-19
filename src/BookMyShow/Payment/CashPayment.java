package BookMyShow.Payment;

public class CashPayment implements Payment{
    @Override
    public void payAmount(double amount) {
        System.out.println("Making a payment via Cash: " + amount);

    }
}
