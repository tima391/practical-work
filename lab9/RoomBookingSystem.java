package lab9;

public class RoomBookingSystem {
    public void bookRoom(int roomNumber) {
        System.out.println("Номер " + roomNumber + " успешно забронирован.");
    }
    public void checkAvailability() {
        System.out.println("Проверка доступных номеров...");
    }
    public void cancelBooking(int roomNumber) {
        System.out.println("Бронирование номера " + roomNumber + " отменено.");
    }
}