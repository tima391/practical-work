package lab9;

public class CleaningService {
    public void scheduleCleaning(int roomNumber) {
        System.out.println("Уборка номера " + roomNumber + " внесена в расписание.");
    }
    public void performCleaning(int roomNumber) {
        System.out.println("Сотрудник службы уборки направлен в номер " + roomNumber + ".");
    }
}
