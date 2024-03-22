package com.bookstore.repository;

import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Query(value = "WITH sales AS (SELECT *, ROW_NUMBER() "
            + "OVER (PARTITION BY name ORDER BY sold DESC) AS row_num"
            + " FROM author) SELECT * FROM sales WHERE row_num <= 2",
            nativeQuery = true)
    List<Author> fetchTop2BySales();

    @Query(value = "WITH sales AS (SELECT *, ROW_NUMBER() "
            + "OVER (PARTITION BY name ORDER BY sold DESC) AS row_num"
            + " FROM author) SELECT * FROM sales WHERE row_num <= ?1",
            nativeQuery = true)
    List<Author> fetchTopNBySales(int n);
}