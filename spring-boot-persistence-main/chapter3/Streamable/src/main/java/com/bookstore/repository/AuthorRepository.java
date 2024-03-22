package com.bookstore.repository;

import com.bookstore.dto.AuthorName;
import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Streamable<Author> findByGenre(String genre);

    Streamable<Author> findByAgeGreaterThan(int age);

    Streamable<AuthorName> findBy();

    Streamable<AuthorName> queryByGenre(String genre);

    /*
    @Query("SELECT a FROM Author a WHERE a.genre = ?1 AND a.age > ?2")
    Streamable<Author> fetchByGenreAndAgeGreaterThan(String genre, int age);

    @Query("SELECT a FROM Author a WHERE a.genre = ?1 OR a.age > ?2")
    Streamable<Author> fetchByGenreAndAgeGreaterThan(String genre, int age);
    */

    Streamable<Author> findByGenreAndAgeGreaterThan(String genre, int age);

    Streamable<Author> findByGenreOrAgeGreaterThan(String genre, int age);
}