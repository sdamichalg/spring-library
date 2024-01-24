package pl.sda.micgeb.library.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class Author {
    private String firstName;
    private String lastName;
}
