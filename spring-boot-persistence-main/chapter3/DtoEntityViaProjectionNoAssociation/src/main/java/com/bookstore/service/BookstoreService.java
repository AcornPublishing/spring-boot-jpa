package com.bookstore.service;

import com.bookstore.dto.BookstoreDto;
import com.bookstore.repository.AuthorRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookstoreService {
    private final AuthorRepository authorRepository;

    public BookstoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional
    public List<BookstoreDto> fetchAuthors() {
        List<BookstoreDto> dto = authorRepository.fetchAll();

        // the fetched Author are managed by Hibernate
        // the following line of code will trigger an UPDATE
        dto.get(0).getAuthor().setAge(47);

        return dto;
    }
}