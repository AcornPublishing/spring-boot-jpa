package com.bookstore;

import com.bookstore.service.BookstoreService;
import com.bookstore.view.AuthorView;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {
    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            Iterable<AuthorView> authors = bookstoreService.fetchAuthors();

            authors.forEach(a -> System.out.println("Author name: "
                    + a.getName() + ", age: " + a.getAge()));
        };
    }
}