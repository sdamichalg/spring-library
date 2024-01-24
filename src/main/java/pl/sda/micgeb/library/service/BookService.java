package pl.sda.micgeb.library.service;

import pl.sda.micgeb.library.model.Author;
import pl.sda.micgeb.library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    public List<Book> books;

    public BookService() {
        Author hemingway = new Author("Ernest", "Hemingway");
        Author orwell = new Author("George", "Orwell");
        Author mickiewicz = new Author("Adam", "Mickiewicz");
        Author prus = new Author("Bolesław", "Prus");
        Author sienkiewicz = new Author("Henryk", "Sienkiewicz");

        Book book1 = new Book("The Old Man and the Sea", hemingway, "1");
        Book book2 = new Book("1984", orwell, "2");
        Book book3 = new Book("Pan Tadeusz", mickiewicz, "3");
        Book book4 = new Book("Lalka", prus, "4");
        Book book5 = new Book("Qua vadis", sienkiewicz, "5");

        books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
    }

    public void showBooks() {
        books.forEach(bk -> System.out.println(bk));
    }

    public static void main(String[] args) {
        BookService service = new BookService();
        service.showBooks();
    }
}
