package lab8P;

class LogisticsAdapterA implements IInternalDeliveryService {
    private ExternalLogisticsServiceA serviceA = new ExternalLogisticsServiceA();

    @Override
    public void deliverOrder(String orderId) {
        try {
            serviceA.shipItem(Integer.parseInt(orderId));
        } catch (Exception e) {
            System.err.println("Ошибка логирования в Адаптере A: Неверный ID");
        }
    }
    @Override
    public String getDeliveryStatus(String orderId) { return serviceA.trackShipment(Integer.parseInt(orderId)); }
    @Override
    public double calculateCost(String orderId) { return 2500.0; }
}

class LogisticsAdapterB implements IInternalDeliveryService {
    private ExternalLogisticsServiceB serviceB = new ExternalLogisticsServiceB();

    @Override
    public void deliverOrder(String orderId) { serviceB.sendPackage("ORDER_ID_" + orderId); }
    @Override
    public String getDeliveryStatus(String orderId) { return serviceB.checkPackageStatus(orderId); }
    @Override
    public double calculateCost(String orderId) { return 3100.0; }
}

class LogisticsAdapterC implements IInternalDeliveryService {
    private ExternalLogisticsServiceC serviceC = new ExternalLogisticsServiceC();

    @Override
    public void deliverOrder(String orderId) { serviceC.pickupAndGo("Склад Almaty", 10); }
    @Override
    public String getDeliveryStatus(String orderId) { return "Pending (C)"; }
    @Override
    public double calculateCost(String orderId) { return 5000.0; }
}