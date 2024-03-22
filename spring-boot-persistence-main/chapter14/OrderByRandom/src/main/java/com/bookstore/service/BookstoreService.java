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

    public void fetchBooksOrderByRnd() {
        List<Book> books = bookRepository.fetchOrderByRnd();

        System.out.println("Books: " + books);
    }
}