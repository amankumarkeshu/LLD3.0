package UberDesign.Strategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void payAmount(double amount) {
        System.out.println("Amount paid via cash is : " + amount);
    }
}
