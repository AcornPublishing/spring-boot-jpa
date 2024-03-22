package com.bookstore.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface AuthorDto {
    String getName();
    int getAge();

    @JsonIgnore
    long getTotal();
}