package lab7;

import java.util.Scanner;

public abstract class ReportGenerator {
    public final void generateReport() {
        log("Инициализация...");
        collectData();
        formatData();
        createHeader();
        if (customerWantsSave()) {
            saveToFile();
        }
        log("Завершено.");
    }

    private void log(String msg) { System.out.println("[LOG]: " + msg); }
    private void collectData() { System.out.println("Сбор данных из базы..."); }

    abstract void formatData();
    abstract void createHeader();
    abstract void saveToFile();

    boolean customerWantsSave() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сохранить в файл? (y/n): ");
        return sc.nextLine().toLowerCase().startsWith("y");
    }
}