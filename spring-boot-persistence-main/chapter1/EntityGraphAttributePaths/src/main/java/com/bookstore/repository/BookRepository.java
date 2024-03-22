package com.bookstore.repository;

import com.bookstore.entity.Book;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Transactional(readOnly = true)
    @EntityGraph(attributePaths = {"author"},
        type = EntityGraph.EntityGraphType.FETCH)
    @Override
    List<Book> findAll();
}
