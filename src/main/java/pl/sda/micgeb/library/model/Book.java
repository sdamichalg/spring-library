package pl.sda.micgeb.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String bookName;
    private Author author;
    private String isbn;
}
