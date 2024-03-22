package com.bookstore.service;

import com.bookstore.entity.Author;
import com.bookstore.repository.AuthorRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookstoreService {
    private final AuthorRepository authorRepository;

    public BookstoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional
    public void cloneAuthor() {
        Author author = authorRepository.fetchByName("Mark Janel");

        Author authorClone = new Author(author, false);
        authorClone.setAge(54);
        authorClone.setName("Farell Tliop");

        /*
        authorClone.getBooks().forEach(
            b -> System.out.println(b.getAuthors()));
        //*/
        authorRepository.save(authorClone);
    }
}
