package lab6;

import java.util.*;

public class StockExchange implements ISubject {
    private Map<String, List<IObserver>> observersMap = new HashMap<>();

    @Override
    public void register(String stockName, IObserver o) {
        observersMap.computeIfAbsent(stockName, k -> new ArrayList<>()).add(o);
        System.out.println("Система: Новый подписчик на акции " + stockName);
    }

    @Override
    public void unregister(String stockName, IObserver o) {
        if (observersMap.containsKey(stockName)) {
            observersMap.get(stockName).remove(o);
        }
    }

    @Override
    public void notifyObservers(String stockName, double price) {
        if (observersMap.containsKey(stockName)) {
            for (IObserver o : observersMap.get(stockName)) {
                o.update(stockName, price);
            }
        }
    }

    public void changePrice(String stockName, double newPrice) {
        System.out.println("\n--- Биржа: Цена " + stockName + " изменилась на " + newPrice + " ---");
        notifyObservers(stockName, newPrice);
    }
}
