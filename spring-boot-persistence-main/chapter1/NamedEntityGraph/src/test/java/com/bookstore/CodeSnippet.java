package com.bookstore;

import com.bookstore.entity.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.HashMap;
import java.util.Map;

@Service
public class CodeSnippet {
    private static Long id = 1L;
    @Autowired
    private EntityManager entityManager;

    public void test1() {
        EntityGraph entityGraph = entityManager
            .getEntityGraph("author-books-graph");

        Map<String, Object> properties = new HashMap<>();
        properties.put("javax.persistence.fetchgraph", entityGraph);
        Author author = entityManager.find(Author.class, id, properties);
    }

    public void test2() {
        EntityGraph entityGraph = entityManager
            .getEntityGraph("author-books-graph");

        Author author = entityManager.createQuery(
                "SELECT a FROM Author a WHERE a.id = :id", Author.class)
            .setParameter("id", id)
            .setHint("javax.persistence.fetchgraph", entityGraph)
            .getSingleResult();
    }

    public void test3() {
        EntityGraph entityGraph = entityManager
            .getEntityGraph("author-books-graph");

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Author> criteriaQuery
            = criteriaBuilder.createQuery(Author.class);

        Root<Author> root = criteriaQuery.from(Author.class);
        criteriaQuery.where(criteriaBuilder.equal(root.<Long>get("id"), id));

        TypedQuery<Author> typedQuery = entityManager.createQuery(criteriaQuery);
        typedQuery.setHint("javax.persistence.loadgraph", entityGraph);

        Author author = typedQuery.getSingleResult();
    }
}
