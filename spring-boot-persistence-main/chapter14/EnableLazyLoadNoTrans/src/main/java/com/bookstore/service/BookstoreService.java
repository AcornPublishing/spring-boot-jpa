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

    public List<Book> fetchBooks() {
        return bookRepository.findByPriceGreaterThan(30);
    }

    // @Transactional(readOnly=true) -> this makes the things even worse
    public void displayAuthors(List<Book> books) {
        books.forEach(b -> System.out.println(b.getAuthor()));
    }
}