package com.bookstore.service;

import com.bookstore.dao.Dao;
import com.bookstore.repository.BookRepository;

import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class BookstoreService {
    private final Dao dao;
    private final BookRepository bookRepository;

    public BookstoreService(Dao dao, BookRepository bookRepository) {
        this.dao = dao;
        this.bookRepository = bookRepository;
    }

    public String titleAndPrice() {
        return bookRepository.fetchTitleAndPrice("$", Instant.now());
        // or, via EntityManager from Dao class
        //return dao.fetchNameAndAmount("$", Instant.now());
    }
}