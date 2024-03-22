package com.bookstore.repository;

import com.bookstore.entity.Author;
import com.bookstore.projection.AuthorNameBookTitle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface AuthorRepository extends JpaRepository<Author, Long> {
    // Fetch authors and books including authors that have no registered book (JPQL)
    @Query(value = "SELECT b.title AS title, a.name AS name "
            + "FROM Author a RIGHT JOIN a.books b")
    List<AuthorNameBookTitle> findAuthorsAndBooksJpql();

    // Fetch authors and books including authors that have no registered book (SQL)
    @Query(value = "SELECT b.title AS title, a.name AS name "
            + "FROM author a RIGHT JOIN book b ON a.id = b.author_id",
            nativeQuery = true)
    List<AuthorNameBookTitle> findAuthorsAndBooksSql();
}