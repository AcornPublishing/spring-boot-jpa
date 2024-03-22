package com.bookstore.repository;

import com.bookstore.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository<T, ID> extends JpaRepository<Book, Long> {
    @Query("SELECT b FROM Book b WHERE b.id IN ?1")
    List<Book> fetchByMultipleIds(List<Long> ids);
}