package lab4;

public class Report implements Document {
    @Override
    public void open() {
        System.out.println("Открыт отчет: Аналитика за текущий месяц.");
    }
}