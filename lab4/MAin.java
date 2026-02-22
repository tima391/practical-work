package lab4;

import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentCreator creator = null;

        System.out.println("Какое приложение запустить?");
        System.out.println("1 - Отчет\n2 - Резюме\n3 - Письмо\n4 - Счет (Invoice)");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                creator = new ReportCreator();
                break;
            case 2:
                creator = new ResumeCreator();
                break;
            case 3:
                creator = new LetterCreator();
                break;
            case 4:
                creator = new InvoiceCreator();
                break;
            default:
                System.out.println("Ошибка: Неизвестный тип документа.");
        }

        if (creator != null) {
            Document myDoc = creator.createDocument();
            myDoc.open();
        }
    }
}