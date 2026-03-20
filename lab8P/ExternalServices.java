package lab8P;

class ExternalLogisticsServiceA {
    public void shipItem(int itemId) { System.out.println("Service A: Доставка товара #" + itemId); }
    public String trackShipment(int shipmentId) { return "In Transit (A)"; }
}

class ExternalLogisticsServiceB {
    public void sendPackage(String info) { System.out.println("Service B: Посылка [" + info + "] отправлена"); }
    public String checkPackageStatus(String code) { return "Delivered (B)"; }
}

class ExternalLogisticsServiceC {
    public void pickupAndGo(String destination, int weight) {
        System.out.println("Service C: Экспресс-доставка в " + destination + " (" + weight + "кг)");
    }
}
