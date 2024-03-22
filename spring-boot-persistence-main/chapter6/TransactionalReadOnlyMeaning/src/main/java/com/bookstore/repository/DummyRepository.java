package com.bookstore.repository;

import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;

@Repository
public interface DummyRepository extends JpaRepository<Author, Long> {
    @QueryHints(value = {
        @QueryHint(
                name = org.hibernate.jpa.QueryHints.HINT_READONLY,
                value = "true")
    })
    Author findFirstByGenre(String genre);
}
