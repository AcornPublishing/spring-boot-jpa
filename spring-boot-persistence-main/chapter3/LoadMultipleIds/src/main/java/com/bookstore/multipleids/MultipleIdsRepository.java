package com.bookstore.multipleids;

import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface MultipleIdsRepository<T, ID extends Serializable> {
    List<T> fetchByMultipleIds(List<ID> ids);
    List<T> fetchInBatchesByMultipleIds(List<ID> ids, int batchSize);
    List<T> fetchBySessionCheckMultipleIds(List<ID> ids);
    List<T> fetchInBatchesBySessionCheckMultipleIds(List<ID> ids, int batchSize);
}