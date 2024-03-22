package com.bookstore.service;

import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookstoreService {
    private final BookRepository bookRepository;

    public BookstoreService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void fetchBooks() {
        List<Book> books = bookRepository.findAll();

        books.forEach(System.out::println);
    }
}