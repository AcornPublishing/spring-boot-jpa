package com.bookstore.service;

import com.bookstore.entity.Author;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class AuthorSpecs {
    private static final int AGE = 45;

    public static Specification<Author> isAgeGt45() {
        return (Root<Author> root, CriteriaQuery<?> query, CriteriaBuilder builder)
                -> builder.greaterThan(root.get("age"), AGE);
    }
}