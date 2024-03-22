package com.bookstore.service;

import com.bookstore.entity.Author;
import com.bookstore.entity.AuthorBook;
import com.bookstore.entity.Book;
import com.bookstore.repository.AuthorBookRepository;
import com.bookstore.repository.AuthorRepository;
import com.bookstore.repository.BookRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookstoreService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final AuthorBookRepository authorBookRepository;

    public BookstoreService(AuthorRepository authorRepository, BookRepository bookRepository, AuthorBookRepository authorBookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.authorBookRepository = authorBookRepository;
    }

    @Transactional
    public void addAuthorAndBook() {
        Author author = new Author();
        author.setName("Alicia Tom");
        author.setAge(38);
        author.setGenre("Anthology");

        authorRepository.save(author);

        Book book = new Book();
        book.setIsbn("001-AT");
        book.setTitle("The book of swords");

        bookRepository.save(book);

        AuthorBook authorBook = new AuthorBook(author, book);

        authorBookRepository.saveAndFlush(authorBook);

        System.out.println("Author: " + author);
        System.out.println("Book: " + book);
    }
}