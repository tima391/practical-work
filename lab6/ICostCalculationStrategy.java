package lab6;

public interface ICostCalculationStrategy {
    double calculate(double distance, int passengers, int serviceClass, double discount);
}
