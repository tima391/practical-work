package lab6;

public interface ISubject {
    void register(String stockName, IObserver o);
    void unregister(String stockName, IObserver o);
    void notifyObservers(String stockName, double price);
}
