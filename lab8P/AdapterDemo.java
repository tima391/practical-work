package lab8P;

public class AdapterDemo {
    public static void main(String[] args) {
        System.out.println("--- Тестирование интеграции логистики ---");

        String[] services = {"A", "B", "C"};

        for (String type : services) {
            IInternalDeliveryService delivery = DeliveryServiceFactory.getService(type);
            delivery.deliverOrder("100" + type);
            System.out.println("Статус: " + delivery.getDeliveryStatus("100" + type));
            System.out.println("Цена: " + delivery.calculateCost("100" + type) + " KZT\n");
        }
    }
}