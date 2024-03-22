package com.bookstore.dto;

public interface BookDto {
    String getTitle();
    AuthorDto getAuthor();

    interface AuthorDto {
        String getName();
        String getGenre();
    }
}