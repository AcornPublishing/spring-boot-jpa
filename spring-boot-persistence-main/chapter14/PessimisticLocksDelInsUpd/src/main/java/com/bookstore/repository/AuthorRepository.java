package com.bookstore.repository;

import com.bookstore.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Override
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Optional<Author> findById(Long id);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    List<Author> findByAgeBetween(int start, int end);

    @Modifying
    @Query("UPDATE Author SET genre = ?1 WHERE id = ?2")
    void updateGenre(String genre, long id);
}