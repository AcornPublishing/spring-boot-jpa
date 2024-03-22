package com.bookstore.service;

import com.bookstore.dto.AuthorDto;
import com.bookstore.repository.AuthorRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookstoreService {
    private final AuthorRepository authorRepository;

    public BookstoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    /*
    public Page<AuthorDto> findAll(Pageable pageable) {
        Page<Author> page = authorRepository.findAll(pageable);

        return new PageImpl<>(AuthorConverter.convert(page.getContent()),
                pageable, page.getTotalElements());
        // or
        //return new PageImpl<>(Mapper.map(page.getContent()),
        //        pageable, page.getTotalElements());
    }
    */

    public Page<AuthorDto> fetchNextPage(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.ASC, "age"));

        List<AuthorDto> authors = authorRepository.fetchAll(pageable);
        Page<AuthorDto> pageOfAuthors = new PageImpl(authors, pageable,
                authors.isEmpty() ? 0 : authors.get(0).getTotal());

        return pageOfAuthors;
    }

    /*
    // 아래는 2개 inner class는 Author List -> AuthorDto List로 변환하는 코드 dummy
    private static class AuthorConverter {
        public static List<AuthorDto> convert(List<Author> content) {
            return Collections.emptyList();;
        }
    }

    private static class Mapper {
        public static List<AuthorDto> map(List<Author> content) {
            return Collections.emptyList();
        }
    }
    */
}