package lab9;

public class HotelFacade {
    private RoomBookingSystem roomBooking = new RoomBookingSystem();
    private RestaurantSystem restaurant = new RestaurantSystem();
    private EventManagementSystem events = new EventManagementSystem();
    private CleaningService cleaning = new CleaningService();

    public void bookFullStay(int roomNumber, String dish) {
        System.out.println("--- Оформление проживания ---");
        roomBooking.bookRoom(roomNumber);
        restaurant.orderFood(dish);
        cleaning.scheduleCleaning(roomNumber);
    }

    public void organizeEvent(String hallName, String equipment, int roomCount) {
        System.out.println("--- Организация мероприятия ---");
        events.reserveHall(hallName);
        events.orderEquipment(equipment);
        for (int i = 1; i <= roomCount; i++) {
            roomBooking.bookRoom(i);
        }
    }

    public void reserveTableWithTaxi(int tableNumber) {
        System.out.println("--- Бронирование столика ---");
        restaurant.reserveTable(tableNumber);
        restaurant.callTaxi();
    }

    public void cancelRoomAndStay(int roomNumber) {
        System.out.println("--- Отмена всех услуг ---");
        roomBooking.cancelBooking(roomNumber);
    }

    public void requestImmediateCleaning(int roomNumber) {
        System.out.println("--- Запрос срочной уборки ---");
        cleaning.performCleaning(roomNumber);
    }
}