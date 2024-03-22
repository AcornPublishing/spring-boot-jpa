package com.bookstore.repository;

import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface AuthorRepository extends JpaRepository<Author, Long> {
    @EntityGraph(value = "author-books-graph",
        type = EntityGraph.EntityGraphType.FETCH)
    List<Author> findByAgeGreaterThanAndGenre(int age, String genre);

    @EntityGraph(value = "author-books-graph",
        type = EntityGraph.EntityGraphType.LOAD)
    List<Author> findByGenreAndAgeGreaterThan(String genre, int age);
}
