package com.bookstore.repository;

import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Transactional(readOnly = true)
    List<AuthorNameAge> findFirst2ByGenre(String genre);

    interface AuthorNameAge {
        String getName();
        int getAge();
    }
}