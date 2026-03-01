package lab6;

class AirplaneStrategy implements ICostCalculationStrategy {
    @Override
    public double calculate(double dist, int pass, int sClass, double disc) {
        double base = dist * 50;
        if (sClass == 2) base *= 2.5;
        return (base * pass) * (1 - disc);
    }
}

class TrainStrategy implements ICostCalculationStrategy {
    @Override
    public double calculate(double dist, int pass, int sClass, double disc) {
        double base = dist * 10;
        if (sClass == 2) base *= 1.5;
        return (base * pass) * (1 - disc);
    }
}

class BusStrategy implements ICostCalculationStrategy {
    @Override
    public double calculate(double dist, int pass, int sClass, double disc) {
        return (dist * 5 * pass) * (1 - disc);
    }
}
