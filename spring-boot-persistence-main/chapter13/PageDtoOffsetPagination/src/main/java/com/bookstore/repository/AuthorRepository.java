package com.bookstore.repository;

import com.bookstore.dto.AuthorDto;
import com.bookstore.entity.Author;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {
    @Query(value = "SELECT a.name as name, a.age as age, "
            + "(SELECT count(a) FROM Author a) AS total FROM Author a")
    List<AuthorDto> fetchAllJpql(Pageable pageable);

    @Query(value = "SELECT t.total, name, age FROM author, "
            + "(SELECT count(*) as total FROM author) AS t",
            nativeQuery = true)
    List<AuthorDto> fetchAllNative(Pageable pageable);
}