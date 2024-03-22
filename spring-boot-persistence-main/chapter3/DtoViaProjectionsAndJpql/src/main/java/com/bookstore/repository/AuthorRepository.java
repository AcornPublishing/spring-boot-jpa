package com.bookstore.repository;

import com.bookstore.entity.Author;
import com.bookstore.projection.AuthorNameAge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Query(value = "SELECT a.name AS name, a.age AS age FROM Author a WHERE a.genre=?1")
    List<AuthorNameAge> fetchByGenre(String genre);

    @Query(value = "SELECT a.name, a.age FROM author a WHERE a.genre=?1 LIMIT 2",
            nativeQuery=true)
    List<AuthorNameAge> fetchByGenreLimit2(String genre);

    @Query(value = "SELECT a.author_name AS name, a.author_age AS age " +
            "FROM author a WHERE a.genre=?1 LIMIT 2",
            nativeQuery=true)
    List<AuthorNameAge> fetchByGenreLimit2WithAlias(String genre);
}