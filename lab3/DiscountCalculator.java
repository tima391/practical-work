package lab3;

interface IDiscountStrategy {
    double apply(double amount);
}

class StandardDiscount implements IDiscountStrategy {
    public double apply(double amount) { return amount * 0.95; } // 5% скидка
}

public class DiscountCalculator {
    public double calculate(double amount, IDiscountStrategy strategy) {
        return strategy.apply(amount);
    }
}