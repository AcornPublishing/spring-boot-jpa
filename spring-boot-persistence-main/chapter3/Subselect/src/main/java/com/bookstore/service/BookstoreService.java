package com.bookstore.service;

import com.bookstore.entity.Book;
import com.bookstore.repository.AuthorSummaryRepository;
import com.bookstore.summary.AuthorSummary;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class BookstoreService {
    private final AuthorSummaryRepository authorSummaryRepository;

    public BookstoreService(AuthorSummaryRepository authorSummaryRepository) {
        this.authorSummaryRepository = authorSummaryRepository;
    }

    @Transactional(readOnly = true)
    public void fetchAuthorWithBooksById(long id, String genre) {
        AuthorSummary author = authorSummaryRepository.findById(id).orElseThrow();

        System.out.println("Author: " + author.getName());

        if (author.getGenre().equals(genre)) {
            // lazy loading the books of this author
            Set<Book> books = author.getBooks();
            books.forEach((b) -> System.out.println("Book: "
                    + b.getTitle() + "(" + b.getIsbn() + ")"));
        }
    }
}