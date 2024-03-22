package com.bookstore;

import com.bookstore.entity.Author;
import com.bookstore.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.Subgraph;
import java.util.HashMap;
import java.util.Map;

@Service
public class CodeSnippet {
    private static Long id = 1L;
    @Autowired
    private EntityManager entityManager;

    public void test() {
        EntityGraph<Author> entityGraph = entityManager
            .createEntityGraph(Author.class);

        Subgraph<Book> bookGraph = entityGraph.addSubgraph("books");
        bookGraph.addAttributeNodes("publisher");

        Map<String, Object> properties = new HashMap<>();
        properties.put("javax.persistence.fetchgraph", entityGraph);
        Author author = entityManager.find(Author.class, id, properties);
    }
}
