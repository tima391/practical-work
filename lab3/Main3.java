package lab3;

public class Main3 {
    public static void main(String[] args) {
        Order1 order = new Order1();
        order.addItem("Ноутбук", 50000);
        order.addItem("Мышь", 2000);

        DiscountCalculator calculator = new DiscountCalculator();
        double discountedPrice = calculator.calculate(order.getTotalAmount(), new StandardDiscount());
        order.setTotalAmount(discountedPrice);

        order.setPaymentMethod(new CreditCardPayment());
        order.setDeliveryMethod(new CourierDelivery());

        System.out.println("Итоговая сумма: " + order.getTotalAmount());
        order.getPaymentMethod().processPayment(order.getTotalAmount());
        order.getDeliveryMethod().deliverOrder(order);

        INotification notifier = new EmailNotification();
        notifier.sendNotification("Заказ оформлен!");
    }
}