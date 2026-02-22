package lab1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга добавлена: " + book.getTitle());
    }

    public void removeBook(String isbn) {
        books.removeIf(b -> b.getIsbn().equals(isbn));
        System.out.println("Книга с ISBN " + isbn + " удалена.");
    }

    public void registerReader(Reader reader) {
        readers.add(reader);
        System.out.println("Зарегистрирован читатель: " + reader.getName());
    }

    public void issueBook(String isbn, int readerId) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.getQuantity() > 0) {
                    book.setQuantity(book.getQuantity() - 1);
                    System.out.println("Книга '" + book.getTitle() + "' выдана читателю ID: " + readerId);
                    return;
                } else {
                    System.out.println("Ошибка: Книги '" + book.getTitle() + "' нет в наличии.");
                    return;
                }
            }
        }
        System.out.println("Книга с таким ISBN не найдена.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setQuantity(book.getQuantity() + 1);
                System.out.println("Книга '" + book.getTitle() + "' возвращена в библиотеку.");
                return;
            }
        }
    }
}