package lab3;
import java.util.ArrayList;
import java.util.List;

public class Order1 {
    private List<String> items = new ArrayList<>();
    private double totalAmount;
    private IPayment paymentMethod;
    private IDelivery deliveryMethod;

    public void addItem(String name, double price) {
        items.add(name);
        totalAmount += price;
    }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double amount) { this.totalAmount = amount; }

    public void setPaymentMethod(IPayment payment) { this.paymentMethod = payment; }
    public void setDeliveryMethod(IDelivery delivery) { this.deliveryMethod = delivery; }

    public IPayment getPaymentMethod() { return paymentMethod; }
    public IDelivery getDeliveryMethod() { return deliveryMethod; }
}