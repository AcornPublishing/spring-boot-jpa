package com.bookstore.repository;

import com.bookstore.entity.Author;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {
    @Transactional
    @Query(value = "SELECT id, name, age, genre, COUNT(*) OVER() AS total FROM author",
            nativeQuery = true)
    List<Author> fetchAll(Pageable pageable);
}