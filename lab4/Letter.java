package lab4;

public class Letter implements Document {
    @Override
    public void open() {
        System.out.println("Открыто письмо: Уважаемый клиент, сообщаем вам о...");
    }
}