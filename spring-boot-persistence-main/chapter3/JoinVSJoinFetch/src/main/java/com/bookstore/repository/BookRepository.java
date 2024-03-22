package com.bookstore.repository;

import com.bookstore.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface BookRepository extends JpaRepository<Book, Long> {
    // INNER JOIN BAD
    @Query(value = "SELECT b FROM Book b INNER JOIN b.author a")
    List<Book> fetchBooksAuthorsInnerJoinBad();

    // INNER JOIN GOOD
    @Query(value = "SELECT b, a FROM Book b INNER JOIN b.author a")
    List<Book> fetchBooksAuthorsInnerJoinGood();

    // JOIN FETCH
    @Query(value = "SELECT b FROM Book b JOIN FETCH b.author a")
    List<Book> fetchBooksAuthorsJoinFetch();
}