package com.bookstore.dto;

import com.bookstore.entity.Author;

public interface BookstoreDto {
    Author getAuthor();
    String getTitle();
}