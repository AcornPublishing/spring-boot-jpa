package com.bookstore.service;

import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepository;

import org.springframework.stereotype.Service;

@Service
public class BookstoreService {
    private final BookRepository bookRepository;

    public BookstoreService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book fetchBookByIsbn() {
        return bookRepository.fetchByIsbn("001", "JN");
    }
}