package lab3;

public interface INotification {
    void sendNotification(String message);
}

class EmailNotification implements INotification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email: " + message);
    }
}