package pl.sda.micgeb.library.dao;

import pl.sda.micgeb.library.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    List<Book> getAllBooks();
    Optional<Book> findBookByIsbn(String isbn);
}
