package lab6;

import java.util.Scanner;

public class Main6P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- ТЕСТ СТРАТЕГИИ ---
        System.out.println("=== 1. Система бронирования (Strategy) ===");
        TravelBookingContext travelApp = new TravelBookingContext();

        System.out.println("Выберите транспорт: 1-Самолет, 2-Поезд, 3-Автобус");
        int type = scanner.nextInt();
        switch(type) {
            case 1 -> travelApp.setStrategy(new AirplaneStrategy());
            case 2 -> travelApp.setStrategy(new TrainStrategy());
            case 3 -> travelApp.setStrategy(new BusStrategy());
        }

        System.out.println("Введите дистанцию (км) и кол-во пассажиров:");
        double d = scanner.nextDouble();
        int p = scanner.nextInt();

        travelApp.calculateTrip(d, p, 1, 0.1);

        System.out.println("\n--------------------------------------\n");

        // --- ТЕСТ НАБЛЮДАТЕЛЯ ---
        System.out.println("=== 2. Биржа акций (Observer) ===");
        StockExchange exchange = new StockExchange();

        Trader ivan = new Trader("Иван");
        TradingRobot bot = new TradingRobot(100.0); // Покупает если цена ниже 100

        exchange.register("APPLE", ivan);
        exchange.register("TESLA", bot);

        exchange.changePrice("APPLE", 150.0);
        exchange.changePrice("TESLA", 95.0); // Бот должен среагировать
    }
}