package com.bookstore.service;

import com.bookstore.entity.Author;
import com.bookstore.repository.AuthorRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookstoreService {
    private final AuthorRepository authorRepository;

    public BookstoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void fetchWithDuplicates() {
        System.out.println("\nFetching authors with duplicates ...");

        List<Author> authors = authorRepository.fetchWithDuplicates();

        authors.forEach(a -> {
            System.out.println("Id: " + a.getId() + ": Name: " + a.getName() + " Books: " + a.getBooks());
        });
    }

    public void fetchWithoutHint() {
        System.out.println("\nFetching authors without HINT_PASS_DISTINCT_THROUGH hint ...");

        List<Author> authors = authorRepository.fetchWithoutHint();

        authors.forEach(a -> {
            System.out.println("Id: " + a.getId() + ": Name: " + a.getName() + " Books: " + a.getBooks());
        });
    }

    public void fetchWithHint() {
        System.out.println("\nFetching authors with HINT_PASS_DISTINCT_THROUGH hint ...");

        List<Author> authors = authorRepository.fetchWithHint();

        authors.forEach(a -> {
            System.out.println("Id: " + a.getId() + ": Name: " + a.getName() + " Books: " + a.getBooks());
        });
    }
}