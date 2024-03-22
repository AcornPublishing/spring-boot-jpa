package com.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AuthorBookId implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "author_id")
    private Long authorId;

    @Column(name = "book_id")
    private Long bookId;

    public AuthorBookId() {
    }

    public AuthorBookId(Long authorId, Long bookId) {
        this.authorId = authorId;
        this.bookId = bookId;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.authorId);
        hash = 31 * hash + Objects.hashCode(this.bookId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final AuthorBookId other = (AuthorBookId) obj;
        if (!Objects.equals(this.authorId, other.authorId)) {
            return false;
        }

        if (!Objects.equals(this.bookId, other.bookId)) {
            return false;
        }

        return true;
    }
}