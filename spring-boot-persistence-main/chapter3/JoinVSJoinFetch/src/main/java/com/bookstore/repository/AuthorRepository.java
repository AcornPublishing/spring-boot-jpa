package com.bookstore.repository;

import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface AuthorRepository extends JpaRepository<Author, Long> {
    // INNER JOIN
    @Query(value = "SELECT a, b FROM Author a INNER JOIN a.books b " +
            "WHERE b.price > ?1")
    List<Author> fetchAuthorsBooksByPriceInnerJoin(int price);

    // JOIN FETCH
    @Query(value = "SELECT a FROM Author a JOIN FETCH a.books b " +
            "WHERE b.price > ?1")
    List<Author> fetchAuthorsBooksByPriceJoinFetch(int price);
}