package com.bookstore.case1.service;

import com.bookstore.case1.repository.AuthorRepository;
import com.bookstore.entity.Author;

import org.springframework.stereotype.Service;

@Service
public class BookstoreService {
    private final AuthorRepository authorRepository;

    public BookstoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void displayAuthor() {
        Author author = fetchAuthor();
        System.out.println(author);
    }

    //@Transactional(readOnly = true)
    public Author fetchAuthor() {
        return authorRepository.fetchByName("Joana Nimar");
    }
}