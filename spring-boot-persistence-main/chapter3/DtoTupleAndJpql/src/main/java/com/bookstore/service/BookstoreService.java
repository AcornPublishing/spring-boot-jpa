package com.bookstore.service;

import com.bookstore.repository.AuthorRepository;

import org.springframework.stereotype.Service;

import javax.persistence.Tuple;
import java.util.List;

@Service
public class BookstoreService {
    private final AuthorRepository authorRepository;

    public BookstoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Tuple> fetchAuthors() {
        return authorRepository.fetchAuthors();
    }
}