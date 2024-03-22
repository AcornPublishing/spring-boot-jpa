package com.bookstore.aggregate;

import org.springframework.data.domain.AfterDomainEventPublication;
import org.springframework.data.domain.DomainEvents;

import java.util.Collection;
import java.util.Collections;

class MyAggregateRoot {
    @DomainEvents
    Collection<Object> domainEvents() {
        // return events you want to get published here
        return Collections.emptyList();
    }

    @AfterDomainEventPublication
    void callbackMethod() {
        // potentially clean up domain events list
    }
}
