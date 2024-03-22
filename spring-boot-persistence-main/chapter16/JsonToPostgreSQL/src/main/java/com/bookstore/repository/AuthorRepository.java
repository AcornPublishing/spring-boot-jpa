package com.bookstore.repository;

import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author findByName(String name);

    @Query(value = "SELECT a.* FROM author a "
            + "WHERE a.book ->> 'isbn' = ?1",
            nativeQuery = true)
    Author findByBookIsbnNativeQuery(String isbn);

    @Query(value = "SELECT a.* FROM author a "
            + "WHERE CAST(a.book ->> 'price' AS INTEGER) = ?1",
            nativeQuery = true)
    Author findByBookPriceNativeQueryCast(int price);
}
