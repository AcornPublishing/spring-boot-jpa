package com.bookstore.repository;

import com.bookstore.dto.AuthorDto;
import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {
    @Query(value = "SELECT name, age, COUNT(*) OVER() AS total FROM author ORDER BY age LIMIT ?1, ?2",
            nativeQuery = true)
    List<AuthorDto> fetchAll(int page, int size);
}