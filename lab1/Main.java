package lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("--- Система управления библиотекой ---");

        while (running) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Зарегистрировать читателя");
            System.out.println("3. Выдать книгу");
            System.out.println("4. Показать статус (выход)");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите автора: ");
                    String author = scanner.nextLine();
                    System.out.print("Введите ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Введите количество: ");
                    int qty = scanner.nextInt();

                    library.addBook(new Book(title, author, isbn, qty));
                    break;

                case 2:
                    System.out.print("Введите имя читателя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите ID читателя (число): ");
                    int id = scanner.nextInt();

                    library.registerReader(new Reader(name, id));
                    break;

                case 3:
                    System.out.print("Введите ISBN книги для выдачи: ");
                    String issueIsbn = scanner.nextLine();
                    System.out.print("Введите ID читателя: ");
                    int readerId = scanner.nextInt();

                    library.issueBook(issueIsbn, readerId);
                    break;

                case 4:
                    running = false;
                    System.out.println("Завершение работы...");
                    break;

                default:
                    System.out.println("Неверный пункт меню.");
            }
        }
        scanner.close();
    }
}