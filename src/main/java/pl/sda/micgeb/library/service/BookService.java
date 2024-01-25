package pl.sda.micgeb.library.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.micgeb.library.dao.BookRepository;
import pl.sda.micgeb.library.model.Book;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public void showBooks() {
        bookRepository.getAllBooks().forEach(bk -> System.out.println(bk));
    }

    public Optional<Book> findByISBN(String isbn) {
        return bookRepository.findBookByIsbn(isbn);
    }


}
