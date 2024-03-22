package com.bookstore.service;

import com.bookstore.repository.AuthorRepository;
import com.bookstore.repository.AuthorRepository.AuthorNameAge;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookstoreService {
    private final AuthorRepository authorRepository;

    public BookstoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<AuthorNameAge> fetchFirst2ByBirthplace() {
        return authorRepository.findFirst2ByGenre("Anthology");
    }
}