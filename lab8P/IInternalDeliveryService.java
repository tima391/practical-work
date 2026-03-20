package lab8P;

public interface IInternalDeliveryService {
    void deliverOrder(String orderId);
    String getDeliveryStatus(String orderId);
    double calculateCost(String orderId); // Доп. задание: расчет стоимости
}
