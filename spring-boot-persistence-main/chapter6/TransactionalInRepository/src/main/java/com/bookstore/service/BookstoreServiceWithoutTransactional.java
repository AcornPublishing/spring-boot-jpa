package com.bookstore.service;

import com.bookstore.entity.Author;
import com.bookstore.repository.AuthorRepositoryWithoutTransactional;

import org.springframework.stereotype.Service;

@Service
public class BookstoreServiceWithoutTransactional {
    private final AuthorRepositoryWithoutTransactional authorRepository;

    public BookstoreServiceWithoutTransactional(AuthorRepositoryWithoutTransactional authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void callFetchByNameMethod() {
        Author author = authorRepository.fetchByName("Joana Nimar");
        System.out.println(author);
    }

    public void callFindByNameMethod() {
        Author author = authorRepository.findByName("Joana Nimar");
        System.out.println(author);
    }

    public void callDeleteByNeGenreMethod() {
        int result = authorRepository.deleteByNeGenre("Anthology");
        System.out.println(result);
    }

    public void callFindByIdMethod() {
        Author author = authorRepository.findById(1L).orElseThrow();
        System.out.println(author);
    }

    public void callFindByIdMethodAndUpdate() {
        Author author = authorRepository.findById(1L).orElseThrow();
        author.setGenre("History");
        authorRepository.save(author);
    }

    public void callFetchByNameAndDeleteByNeGenreMethods() {
        Author author = authorRepository.fetchByName("Joana Nimar");
        authorRepository.deleteByNeGenre(author.getGenre());
    }
}
