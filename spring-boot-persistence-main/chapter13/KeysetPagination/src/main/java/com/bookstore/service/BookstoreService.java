package com.bookstore.service;

import com.bookstore.dto.AuthorDto;
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

    public List<Author> fetchNextPage(long id, int limit) {
        return authorRepository.fetchAll(id, limit);
    }

    public List<AuthorDto> fetchNextPageDto(long id, int limit) {
        return authorRepository.fetchAllDto(id, limit);
    }
}