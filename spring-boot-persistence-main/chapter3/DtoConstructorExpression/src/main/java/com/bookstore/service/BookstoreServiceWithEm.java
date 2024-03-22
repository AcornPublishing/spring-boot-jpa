package com.bookstore.service;

import com.bookstore.dto.AuthorDto;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class BookstoreServiceWithEm {
    @PersistenceContext
    private EntityManager entityManager;

    public List<AuthorDto> getResultList() {
        Query query = entityManager.createQuery(
                "SELECT new com.bookstore.dto.AuthorDto(a.name, a.age) " +
                        "FROM Author a", AuthorDto.class);
        List<AuthorDto> authors = query.getResultList();

        return authors;
    }
}