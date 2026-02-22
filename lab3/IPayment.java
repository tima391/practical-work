package lab3;

public interface IPayment {
    void processPayment(double amount);
}

class CreditCardPayment implements IPayment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплачено " + amount + " через Credit Card.");
    }
}