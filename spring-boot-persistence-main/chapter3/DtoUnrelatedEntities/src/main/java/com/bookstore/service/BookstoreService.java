package com.bookstore.service;

import com.bookstore.dto.BookstoreDto;
import com.bookstore.repository.AuthorRepository;
import com.bookstore.repository.BookRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookstoreService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BookstoreService(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public List<BookstoreDto> fetchAuthorNameBookTitleWithPrice(int price) {
        return authorRepository.fetchAuthorNameBookTitleWithPrice(price);
    }
}