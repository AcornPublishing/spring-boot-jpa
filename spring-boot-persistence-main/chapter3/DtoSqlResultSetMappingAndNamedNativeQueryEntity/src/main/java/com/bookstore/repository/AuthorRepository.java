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
    @Query(name = "AuthorQuery", nativeQuery = true)
    List<Author> fetchAll();

    /* this currently is not supported */
    // @Query(name = "AuthorWithBookQuery", nativeQuery = true)
    // List<Object[]> fetchWithBook();
}