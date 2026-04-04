package lab9;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТ ПАТТЕРНА ФАСАД ===");
        HotelFacade hotel = new HotelFacade();

        hotel.bookFullStay(101, "Завтрак: Омлет и кофе");
        hotel.organizeEvent("Grand BallRoom", "Проектор и микрофоны", 3);
        hotel.reserveTableWithTaxi(5);
        hotel.requestImmediateCleaning(101);

        System.out.println("\n");

        System.out.println("=== ТЕСТ ПАТТЕРНА КОМПОНОВЩИК ===");

        Department corporation = new Department("Global Tech");
        Department itDept = new Department("IT Департамент");
        Department hrDept = new Department("HR Отдел");

        Employee dev1 = new Employee("Тимур", "Senior Developer", 1200000);
        Employee dev2 = new Employee("Алиса", "Middle Developer", 800000);
        Contractor freelancer = new Contractor("Иван", "UI Designer", 300000);

        itDept.add(dev1);
        itDept.add(dev2);
        itDept.add(freelancer);

        Employee hr1 = new Employee("Елена", "Recruiter", 450000);
        hrDept.add(hr1);

        corporation.add(itDept);
        corporation.add(hrDept);

        corporation.display(0);
        System.out.println("\nОбщий бюджет корпорации: " + corporation.getBudget() + " тг.");
        System.out.println("Общий штат: " + corporation.getEmployeeCount() + " чел.");

        System.out.println("\n--- Поиск сотрудника ---");
        corporation.findAndDisplayEmployee("Тимур");

        System.out.println("\n--- Повышение зарплаты ---");
        dev1.setSalary(1500000);
        System.out.println("Новый бюджет IT отдела: " + itDept.getBudget());
    }
}
