package com.bookstore.repository;

import com.bookstore.entity.Chapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import java.util.Optional;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {
    @Override
    @Lock(LockModeType.OPTIMISTIC_FORCE_INCREMENT)
    Optional<Chapter> findById(Long id);
}