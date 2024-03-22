package com.bookstore.repository;

import com.bookstore.entity.Author;
import com.bookstore.projection.AuthorNameAge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Query("SELECT a.name AS name, a.age AS age FROM Author a WHERE a.age >= ?1")
    List<AuthorNameAge> fetchByAge(int age);
}