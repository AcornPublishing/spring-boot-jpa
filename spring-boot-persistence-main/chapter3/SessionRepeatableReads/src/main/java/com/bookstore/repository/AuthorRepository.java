package com.bookstore.repository;

import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Query("SELECT a FROM Author a WHERE a.id = ?1")
    Optional<Author> fetchById(long id);

    @Query("SELECT a FROM Author a WHERE a.id = ?1")
    Author fetchByIdJpql(long id);

    @Query(value = "SELECT * FROM author WHERE id = ?1", nativeQuery = true)
    Author fetchByIdSql(long id);

    @Query("SELECT a.name FROM Author a WHERE a.id = ?1")
    String fetchNameByIdJpql(long id);

    @Query(value = "SELECT name FROM author WHERE id = ?1", nativeQuery = true)
    String fetchNameByIdSql(long id);
}