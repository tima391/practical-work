package lab8P;

public class DeliveryServiceFactory {
    public static IInternalDeliveryService getService(String type) {
        return switch (type.toUpperCase()) {
            case "A" -> new LogisticsAdapterA();
            case "B" -> new LogisticsAdapterB();
            case "C" -> new LogisticsAdapterC();
            default -> throw new IllegalArgumentException("Неизвестный тип службы: " + type);
        };
    }
}