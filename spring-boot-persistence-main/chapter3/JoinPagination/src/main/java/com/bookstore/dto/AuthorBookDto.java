package com.bookstore.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface AuthorBookDto {
    String getName();  // of author
    int getAge();      // of author
    String getTitle(); // of book
    String getIsbn();  // of book

    @JsonIgnore
    long getTotal();
}
