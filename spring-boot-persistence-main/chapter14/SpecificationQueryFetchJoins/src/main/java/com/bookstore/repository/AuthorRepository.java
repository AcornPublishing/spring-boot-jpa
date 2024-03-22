package com.bookstore.repository;

import com.bookstore.entity.Author;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.QueryHint;
import java.util.List;

import static org.hibernate.jpa.QueryHints.HINT_PASS_DISTINCT_THROUGH;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>, JpaSpecificationExecutor<Author> {
    @Transactional(readOnly = true)
    @Query(value = "SELECT a.id FROM Author a WHERE a.genre = ?1")
    Page<Long> fetchPageOfIdsByGenre(String genre, Pageable pageable);

    @Override
    @QueryHints(value = @QueryHint(name = HINT_PASS_DISTINCT_THROUGH, value = "false"))
    List<Author> findAll(Specification<Author> spec);

    @Override
    @QueryHints(value = @QueryHint(name = HINT_PASS_DISTINCT_THROUGH, value = "false"))
    Page<Author> findAll(Specification<Author> spec, Pageable pageable);
}