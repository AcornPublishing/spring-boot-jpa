package com.bookstore.case2.repository;

import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepositoryWithoutTransactional extends JpaRepository<Author, Long> {
    @Query("SELECT a FROM Author a WHERE a.name = ?1")
    Author fetchByName(String name);
}