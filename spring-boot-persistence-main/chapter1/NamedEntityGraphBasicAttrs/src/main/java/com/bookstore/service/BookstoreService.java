package com.bookstore.service;

import com.bookstore.entity.Author;
import com.bookstore.entity.Book;
import com.bookstore.repository.AuthorRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookstoreService {
    private final AuthorRepository authorRepository;

    public BookstoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void displayAuthorsAndBooksByGenreAndAge(String genre, int age) {
        List<Author> authors = authorRepository.findByGenreAndAgeGreaterThan(genre, age);

        for (Author author : authors) {
            System.out.println("\nAuthor: " + author.getName());

            List<Book> books = author.getBooks();
            for (Book book : books) {
                System.out.println("Book: " + book.getTitle());
            }
        }
    }

    public void displayAuthorsAndBooksByAgeAndGenre(int age, String genre) {
        List<Author> authors = authorRepository.findByAgeGreaterThanAndGenre(age, genre);

        for (Author author : authors) {
            System.out.println("\nAuthor: " + author.getName());

            List<Book> books = author.getBooks();
            for (Book book : books) {
                System.out.println("Book: " + book.getTitle());
            }
        }
    }
}
