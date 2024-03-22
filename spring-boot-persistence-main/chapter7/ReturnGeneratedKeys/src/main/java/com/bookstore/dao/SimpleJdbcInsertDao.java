package com.bookstore.dao;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.Map;

@Repository
public class SimpleJdbcInsertDao implements AuthorDao {
    private final SimpleJdbcInsert simpleJdbcInsert;

    public SimpleJdbcInsertDao(DataSource dataSource) {
        this.simpleJdbcInsert = new SimpleJdbcInsert(dataSource)
                .withTableName("author").usingGeneratedKeyColumns("id");
    }

    @Override
    @Transactional
    public long insertAuthor(int age, String name, String genre) {
        return simpleJdbcInsert.executeAndReturnKey(
                Map.of("age", age, "name", name, "genre", genre)
        ).longValue();
    }
}