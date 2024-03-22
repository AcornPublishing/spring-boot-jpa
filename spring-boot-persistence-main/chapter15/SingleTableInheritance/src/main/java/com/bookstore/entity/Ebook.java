package com.bookstore.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@DiscriminatorValue("2")
public class Ebook extends Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull
    private String format;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ebook{" + "format=" + format + '}';
    }
}