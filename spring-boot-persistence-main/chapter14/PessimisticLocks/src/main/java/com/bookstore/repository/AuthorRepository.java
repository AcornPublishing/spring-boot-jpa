package com.bookstore.repository;

import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Override
    @Lock(LockModeType.PESSIMISTIC_READ) // for exclusive lock switch to PESSIMISTIC_WRITE
    Optional<Author> findById(Long id);
}