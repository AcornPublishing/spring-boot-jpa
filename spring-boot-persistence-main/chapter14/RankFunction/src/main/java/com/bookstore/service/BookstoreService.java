package com.bookstore.service;

import com.bookstore.dto.AuthorDto;
import com.bookstore.repository.AuthorRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookstoreService {
    private final AuthorRepository authorRepository;

    public BookstoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void fetchAuthorsWithRank1() {
        List<AuthorDto> authors = authorRepository.fetchWithRank1();

        authors.forEach(a ->
                System.out.println(a.getRankNum() + ", " + a.getName() + ", " + a.getGenre()));
    }

    public void fetchAuthorsWithRank2() {
        List<AuthorDto> authors = authorRepository.fetchWithRank2();

        authors.forEach(a ->
                System.out.println(a.getRankNum() + ", " + a.getName() + ", " + a.getGenre()));
    }
}