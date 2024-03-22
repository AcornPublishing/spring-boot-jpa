package com.bookstore.repository;

import com.bookstore.entity.Author;
import com.bookstore.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Transactional
    @Modifying(flushAutomatically = true, clearAutomatically = true)
    @Query(value = "UPDATE Book b SET b.isbn='None', b.version=b.version + 1")
    int updateInBulk();

    @Transactional
    @Modifying(flushAutomatically = true, clearAutomatically = true)
    @Query(value = "UPDATE Book b SET b.isbn='None', b.version = b.version + 1 " +
            "WHERE b.author IN ?1")
    int updateInBulk(List<Author> authors);
}