package com.bookstore.entity;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@DynamicUpdate
@OptimisticLocking(type = OptimisticLockType.DIRTY)
public class Inventory implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private String title;
    private int quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}