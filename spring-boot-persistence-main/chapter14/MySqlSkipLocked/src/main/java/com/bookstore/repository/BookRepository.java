package com.bookstore.repository;

import com.bookstore.entity.Book;
import com.bookstore.entity.BookStatus;
import org.hibernate.LockOptions;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import javax.persistence.QueryHint;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @QueryHints({
            @QueryHint(name = "javax.persistence.lock.timeout", value = "" + LockOptions.SKIP_LOCKED)})
    List<Book> findTop3ByStatus(BookStatus status, Sort sort);
}