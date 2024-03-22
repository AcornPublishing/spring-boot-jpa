package com.bookstore.repository;

import com.bookstore.entity.Paperback;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface PaperbackRepository extends JpaRepository<Paperback, Long> {
    Paperback findByTitle(String title);
}