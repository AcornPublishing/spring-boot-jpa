package com.bookstore.repository;

import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.stream.Stream;

import static org.hibernate.jpa.QueryHints.HINT_FETCH_SIZE;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Query("SELECT a FROM Author a")
    @QueryHints(value = @QueryHint(name = HINT_FETCH_SIZE, value = "" + Integer.MIN_VALUE))
    Stream<Author> streamAll();

    /* use this method if you add to JDBC URL the useCursorFetch=true setting
    @Query("SELECT a FROM Author a")
    @QueryHints(value = @QueryHint(name = HINT_FETCH_SIZE, value = "30"))
    Stream<Author> streamAll();
    */
}