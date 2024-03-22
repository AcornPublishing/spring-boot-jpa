package com.bookstore.repository;

import com.bookstore.entity.Author;
import com.bookstore.impl.BatchRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends BatchRepository<Author, Long> {
}