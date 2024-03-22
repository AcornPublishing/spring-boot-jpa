package com.bookstore;

import com.bookstore.case1.service.BookstoreService;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// for case 2,
// - change import class package case1 -> case2
// - change the package name to com.bookstore.case2
// - comment out the case 1 code and uncomment out the case 2 code in init() method
@SpringBootApplication(scanBasePackages = {"com.bookstore.case1", "com.bookstore.entity"})
@EnableJpaRepositories(basePackages = "com.bookstore.case1")
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
            System.out.println("=========================================");
            System.out.println("Case 1");
            bookstoreService.displayAuthor();
            System.out.println("=========================================");

            /*
            System.out.println("=========================================");
            System.out.println("Case 2");
            bookstoreService.computeRoyalties();
            System.out.println("=========================================");
            */
        };
    }
}