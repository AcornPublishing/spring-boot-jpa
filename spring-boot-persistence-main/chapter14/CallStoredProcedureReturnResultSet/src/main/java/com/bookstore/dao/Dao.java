package com.bookstore.dao;

import com.bookstore.dto.AuthorDto;
import com.bookstore.entity.Author;
import java.util.List;

public interface Dao {
    List<Author> fetchByGenre1(String genre);
    List<Author> fetchByGenre2(String genre);
    List<AuthorDto> fetchByGenre3(String genre);
    List<AuthorDto> fetchByGenre4(String genre);
}