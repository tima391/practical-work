package lab4;

public class Resume implements Document {
    @Override
    public void open() {
        System.out.println("Открыто резюме: Соискатель на должность Java-разработчик.");
    }
}