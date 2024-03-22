package com.bookstore.case2.service;

import com.bookstore.case2.repository.AuthorRepositoryWithoutTransactional;
import com.bookstore.entity.Author;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookstoreServiceWith2Methods {
    private final AuthorRepositoryWithoutTransactional authorRepository;
    private Royalty royalties = new Royalty();

    public BookstoreServiceWith2Methods(AuthorRepositoryWithoutTransactional authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Royalty computeRoyalties() {
        Author author = fetchAuthorByName("Joana Nimar");

        // computing royalties is a slow task
        // that requires interaction with other services
        // (e.g., revenue and financial services)

        return royalties;
    }

    @Transactional(readOnly = true)
    public Author fetchAuthorByName(String name) {
        return authorRepository.fetchByName(name);
    }
}