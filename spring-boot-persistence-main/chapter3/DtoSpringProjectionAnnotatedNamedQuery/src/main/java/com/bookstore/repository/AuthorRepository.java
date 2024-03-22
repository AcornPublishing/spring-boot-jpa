package com.bookstore.repository;

import com.bookstore.dto.AuthorNameAge;
import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface AuthorRepository extends JpaRepository<Author, Long> {
    // Scalar Mapping
    List<String> fetchName();

    // Spring projection
    List<AuthorNameAge> fetchNameAndAge();
}