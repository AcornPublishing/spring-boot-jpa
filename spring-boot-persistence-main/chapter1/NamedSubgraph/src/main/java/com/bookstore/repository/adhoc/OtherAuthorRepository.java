package com.bookstore.repository.adhoc;

import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface OtherAuthorRepository extends JpaRepository<Author, Long> {
    @Override
    @EntityGraph(attributePaths = {"books.publisher"},
        type = EntityGraph.EntityGraphType.FETCH)
    List<Author> findAll();
}
