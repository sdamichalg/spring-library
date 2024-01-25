package pl.sda.micgeb.library.dao;

import org.springframework.stereotype.Repository;
import pl.sda.micgeb.library.model.Author;
import pl.sda.micgeb.library.model.Book;

import java.util.*;

@Repository
public class InMemoryBookRepository implements BookRepository{

    private static final Map<Integer, Book> booksMap;

    static {
        booksMap = new HashMap<>();

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

        booksMap.put(1, book1);
        booksMap.put(2, book2);
        booksMap.put(3, book3);
        booksMap.put(4, book4);
        booksMap.put(5, book5);
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(booksMap.values());
    }

    @Override
    public Optional<Book> findBookByIsbn(String isbn) {
        return booksMap.values()
                .stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .findFirst();
    }
}
