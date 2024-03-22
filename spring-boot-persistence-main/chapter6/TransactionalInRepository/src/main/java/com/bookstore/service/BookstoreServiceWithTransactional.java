package com.bookstore.service;

import com.bookstore.entity.Author;
import com.bookstore.repository.AuthorRepositoryWithoutTransactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Service
public class BookstoreServiceWithTransactional {
    private final AuthorRepositoryWithoutTransactional authorRepository;

    public BookstoreServiceWithTransactional(AuthorRepositoryWithoutTransactional authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional(readOnly = true)
    public void callFetchByNameMethod() {
        Author author = authorRepository.fetchByName("Joana Nimar");
        System.out.println(author);
    }

    @Transactional
    public void callFindByIdMethodAndUpdate() {
        Author author = authorRepository.findById(1L).orElseThrow();
        author.setGenre("History");
    }

    @Transactional
    public void callFetchByNameAndDeleteByNeGenreMethods() {
        Author author = authorRepository.fetchByName("Joana Nimar");
        authorRepository.deleteByNeGenre(author.getGenre());

        if (new Random().nextBoolean()) {
            throw new RuntimeException("Some DAO exception occurred!");
        }
    }

    @Transactional(readOnly = true)
    public void longRunningServiceMethod() throws InterruptedException {
        System.out.println("Service-method start ...");
        System.out.println("Sleeping before triggering SQL to simulate a long running code ...");
        Thread.sleep(40_000);

        Author author = authorRepository.fetchByName("Joana Nimar");
        System.out.println(author);

        System.out.println("Service-method done ...");
    }
}