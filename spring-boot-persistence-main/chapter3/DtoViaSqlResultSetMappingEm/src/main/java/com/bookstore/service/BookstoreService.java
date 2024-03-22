package com.bookstore.service;

import com.bookstore.dao.AuthorDaoImpl;
import com.bookstore.dto.AuthorDto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookstoreService {
    private final AuthorDaoImpl dao;

    public BookstoreService(AuthorDaoImpl dao) {
        this.dao = dao;
    }

    public List<AuthorDto> fetchAuthorsNamesAndAges() {
        return dao.fetchNameAndAge();
    }
}