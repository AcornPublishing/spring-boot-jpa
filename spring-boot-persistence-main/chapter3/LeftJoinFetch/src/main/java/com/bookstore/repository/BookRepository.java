
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
    @Query(value = "SELECT b FROM Book b LEFT JOIN FETCH b.author")
    // or, via JOIN
    // @Query(value = "SELECT b, a FROM Book b LEFT JOIN b.author a")
    List<Book> fetchBookWithAuthor();
}