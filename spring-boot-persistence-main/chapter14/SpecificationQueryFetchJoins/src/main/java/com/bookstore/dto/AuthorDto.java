package com.bookstore.dto;

import java.util.List;

public interface AuthorDto {
    Long getId();
    String getName();
    String getGenre();
    int getAge();
    List<BookDto> getBooks();
}