package pl.sda.micgeb.library.dao;

import pl.sda.micgeb.library.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBooks();
}
