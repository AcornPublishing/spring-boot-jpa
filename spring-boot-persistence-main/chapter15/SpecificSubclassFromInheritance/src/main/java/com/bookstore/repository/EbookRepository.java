package com.bookstore.repository;

import com.bookstore.entity.Ebook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface EbookRepository extends JpaRepository<Ebook, Long> {
    Ebook findByTitle(String title);

    /*
    @Query("SELECT b FROM Author a JOIN a.books b WHERE a.name = ?1")
    Ebook findByAuthorName(String name);
    */

    @Query("SELECT b FROM Author a JOIN a.books b " +
            "WHERE a.name = ?1 AND TYPE(b) = 'Ebook'")
    Ebook findByAuthorName(String name);
}