package lab9;

public class RestaurantSystem {
    public void reserveTable(int tableNumber) {
        System.out.println("Столик №" + tableNumber + " забронирован в ресторане.");
    }
    public void orderFood(String dish) {
        System.out.println("Заказ принят: " + dish);
    }
    public void callTaxi() {
        System.out.println("Такси вызвано к главному входу отеля.");
    }
}
