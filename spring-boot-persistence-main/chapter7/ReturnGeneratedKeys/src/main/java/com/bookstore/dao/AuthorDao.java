package com.bookstore.dao;

public interface AuthorDao {
    long insertAuthor(int age, String name, String genre);
}