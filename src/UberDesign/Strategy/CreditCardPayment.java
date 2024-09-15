package UberDesign.Strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void payAmount(double amount) {
        System.out.println("Amount paid via card is : " + amount);

    }
}
