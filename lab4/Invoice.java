package lab4;

public class Invoice implements Document {
    @Override
    public void open() {
        System.out.println("Открыт счет на оплату: №1024 от 15.02.2026.");
    }
}