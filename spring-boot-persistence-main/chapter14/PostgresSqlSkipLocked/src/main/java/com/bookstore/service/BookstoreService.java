package com.bookstore.service;

import com.bookstore.entity.Book;
import com.bookstore.entity.BookStatus;
import com.bookstore.repository.BookRepository;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

@Service
public class BookstoreService {
    private final TransactionTemplate template;
    private final BookRepository bookRepository;

    public BookstoreService(BookRepository bookRepository, TransactionTemplate template) {
        this.bookRepository = bookRepository;
        this.template = template;
    }

    public void fetchBooksViaTwoTransactions() {
        template.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
        template.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                List<Book> books = bookRepository
                        .findTop3ByStatus(BookStatus.PENDING, Sort.by(Sort.Direction.ASC, "id"));

                template.execute(new TransactionCallbackWithoutResult() {
                    @Override
                    protected void doInTransactionWithoutResult(TransactionStatus status) {
                        List<Book> books = bookRepository
                                .findTop3ByStatus(BookStatus.PENDING, Sort.by(Sort.Direction.ASC, "id"));
                        System.out.println("Second transaction: " + books);
                    }
                });
                System.out.println("First transaction: " + books);
            }
        });

        System.out.println("Done!");
    }
}