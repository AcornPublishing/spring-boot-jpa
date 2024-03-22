package com.bookstore.dao;

import com.bookstore.dto.AuthorDto;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class AuthorDaoImpl implements AuthorDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<AuthorDto> fetchNameAndAge() {
        Query query = entityManager.createNativeQuery("SELECT name, age FROM author", "AuthorDtoMapping");
        List<AuthorDto> authors = query.getResultList();

        return authors;
    }
}