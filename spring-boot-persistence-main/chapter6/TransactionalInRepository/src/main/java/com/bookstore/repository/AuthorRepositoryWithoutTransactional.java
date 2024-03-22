package com.bookstore.repository;

import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepositoryWithoutTransactional extends JpaRepository<Author, Long> {
    @Query("SELECT a FROM Author a WHERE a.name = ?1")
    Author fetchByName(String name);

    Author findByName(String name);

    @Modifying
    @Query("DELETE FROM Author a WHERE a.genre <> ?1")
    int deleteByNeGenre(String genre);
}