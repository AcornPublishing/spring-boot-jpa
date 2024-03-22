package com.bookstore.service;

import com.bookstore.entity.Author;
import com.bookstore.entity.Book;
import com.bookstore.repository.AuthorRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookstoreService {
    private final AuthorRepository authorRepository;

    public BookstoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional(readOnly = true)
    public void fetchAuthorWithAllBooks() {
        Author author = authorRepository.findById(1L).orElseThrow();
        List<Book> books = author.getBooks();

        System.out.println(books);
    }

    @Transactional(readOnly = true)
    public void fetchAuthorWithCheapBooks() {
        Author author = authorRepository.findById(1L).orElseThrow();
        List<Book> books = author.getCheapBooks();

        System.out.println(books);
    }

    @Transactional(readOnly = true)
    public void fetchAuthorWithRestOfBooks() {
        Author author = authorRepository.findById(1L).orElseThrow();
        List<Book> books = author.getRestOfBooks();

        System.out.println(books);
    }
}
