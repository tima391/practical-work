package lab2P;
public class main2 {
    public static void main(String[] args) {
        UserManager manager = new UserManager();

        manager.addUser(new User("Arman", "arman@mail.kz", "Admin"));
        manager.addUser(new User("Aigerim", "aiga@mail.kz", "User"));

        System.out.println("Бастапқы тізім:");
        manager.getAllUsers().forEach(System.out::println);

        manager.updateUser("arman@mail.kz", "Arman Updated", "SuperAdmin");

        manager.removeUser("aiga@mail.kz");

        System.out.println("\nӨзгерістен кейінгі тізім:");
        manager.getAllUsers().forEach(System.out::println);
    }
}