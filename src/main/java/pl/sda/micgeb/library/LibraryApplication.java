package pl.sda.micgeb.library;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.micgeb.library.service.BookService;

@SpringBootApplication
@RequiredArgsConstructor
public class LibraryApplication implements CommandLineRunner {

    private final BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        bookService.showBooks();
        System.out.println("================");
        bookService.findByISBN("2").ifPresentOrElse(
                book -> System.out.println("Book found: " + book),
                () -> System.out.println("Book not found for ISBN")
        );
    }
}
