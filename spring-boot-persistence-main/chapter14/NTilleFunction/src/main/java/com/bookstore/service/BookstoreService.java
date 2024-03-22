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

    public void fetchAuthorsWithNTile1() {
        List<AuthorDto> authors = authorRepository.fetchWithNTile1();

        authors.forEach(a ->
                System.out.println(a.getTile() + ", " + a.getName() + ", " + a.getGenre() + ", " + a.getAge()));
    }

    public void fetchAuthorsWithNTile2() {
        List<AuthorDto> authors = authorRepository.fetchWithNTile2();

        authors.forEach(a ->
                System.out.println(a.getTile() + ", " + a.getName() + ", " + a.getGenre() + ", " + a.getAge()));
    }

    public void fetchAuthorsWithNTile3() {
        List<AuthorDto> authors = authorRepository.fetchWithNTile3();

        authors.forEach(a ->
                System.out.println(a.getTile() + ", " + a.getName() + ", " + a.getGenre() + ", " + a.getAge()));
    }
}