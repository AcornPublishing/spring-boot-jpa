package com.bookstore.spring.dto;

import java.util.List;

public interface AuthorDto {
    String getName();
    String getGenre();
    List<BookDto> getBooks();

    interface BookDto {
        String getTitle();
    }
}