package lab6;

public class TravelBookingContext {
    private ICostCalculationStrategy strategy;

    public void setStrategy(ICostCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public void calculateTrip(double dist, int pass, int sClass, double disc) {
        if (strategy == null) {
            System.out.println("Ошибка: Транспорт не выбран!");
            return;
        }
        double result = strategy.calculate(dist, pass, sClass, disc);
        System.out.println("Итоговая стоимость поездки: " + result + " руб.");
    }
}