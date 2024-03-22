package com.bookstore.case2.service;

import com.bookstore.case2.repository.AuthorRepository;
import com.bookstore.entity.Author;

import org.springframework.stereotype.Service;

@Service
public class BookstoreService {
    private final AuthorRepository authorRepository;
    private Royalty royalties = new Royalty();

    public BookstoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    //@Transactional(readOnly = true)
    public Royalty computeRoyalties() {
        Author author = authorRepository.fetchByName("Joana Nimar");
        // computing royalties is a slow task
        // that requires interaction with other services
        // (e.g., revenue and financial services)
        return royalties;
    }
}