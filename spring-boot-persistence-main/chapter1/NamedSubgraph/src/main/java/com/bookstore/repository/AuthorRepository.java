package com.bookstore.repository;

import com.bookstore.entity.Author;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface AuthorRepository extends JpaRepository<Author, Long>, JpaSpecificationExecutor<Author> {
    @Override
    @EntityGraph(value = "author-books-publisher-graph",
        type = EntityGraph.EntityGraphType.FETCH)
    List<Author> findAll();

    @EntityGraph(value = "author-books-publisher-graph",
        type = EntityGraph.EntityGraphType.FETCH)
    List<Author> findByAgeLessThanOrderByNameDesc(int age);

    @Override
    @EntityGraph(value = "author-books-publisher-graph",
        type = EntityGraph.EntityGraphType.FETCH)
    List<Author> findAll(Specification<Author> spec);

    @EntityGraph(value = "author-books-publisher-graph",
        type = EntityGraph.EntityGraphType.FETCH)
    @Query(value="SELECT a FROM Author a WHERE a.age > 20 AND a.age<40")
    List<Author> fetchAllAgeBetween20And40();
}
