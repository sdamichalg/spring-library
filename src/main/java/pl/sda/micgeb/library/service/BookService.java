package pl.sda.micgeb.library.service;

import org.springframework.stereotype.Service;
import pl.sda.micgeb.library.model.Author;
import pl.sda.micgeb.library.model.Book;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    public BookService() {
    }

    public void showBooks() {
        books.forEach(bk -> System.out.println(bk));
    }
}
