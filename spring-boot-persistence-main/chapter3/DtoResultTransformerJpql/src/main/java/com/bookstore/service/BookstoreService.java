package com.bookstore.service;

import com.bookstore.dao.Dao;
import com.bookstore.dto.AuthorDtoNoSetters;
import com.bookstore.dto.AuthorDtoWithSetters;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookstoreService {
    private final Dao dao;

    public BookstoreService(Dao dao) {
        this.dao = dao;
    }

    public List<AuthorDtoNoSetters> fetchAuthorsNoSetters() {
        return dao.fetchAuthorsNoSetters();
    }

    public List<AuthorDtoWithSetters> fetchAuthorsWithSetters() {
        return dao.fetchAuthorsWithSetters();
    }
}