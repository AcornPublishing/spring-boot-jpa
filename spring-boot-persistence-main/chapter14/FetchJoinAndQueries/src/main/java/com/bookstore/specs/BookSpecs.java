package com.bookstore.specs;

import com.bookstore.entity.Book;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class BookSpecs {
    private static final int PRICE = 35;

    public static Specification<Book> isPriceGt35() {
        return (Root<Book> root,
                CriteriaQuery<?> query, CriteriaBuilder builder)
                -> builder.greaterThan(root.get("price"), PRICE);
    }
}