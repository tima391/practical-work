package lab6;

class Trader implements IObserver {
    private String name;
    public Trader(String name) { this.name = name; }

    @Override
    public void update(String stock, double price) {
        System.out.println("Трейдер " + name + " видит: " + stock + " теперь стоит " + price);
    }
}

class TradingRobot implements IObserver {
    private double threshold;
    public TradingRobot(double threshold) { this.threshold = threshold; }

    @Override
    public void update(String stock, double price) {
        if (price < threshold) {
            System.out.println("РОБОТ: Цена " + stock + " (" + price + ") низкая! ПОКУПАЮ!");
        } else {
            System.out.println("РОБОТ: Цена " + stock + " выше порога. Жду.");
        }
    }
}
