package com.bookstore.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public interface AuthorDto {
    Integer getAge();
    String getName();
    String getGenre();
    String getEmail();
    String getAddress();
}