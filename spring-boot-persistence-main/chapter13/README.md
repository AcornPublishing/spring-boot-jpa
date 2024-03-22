# Chapter 13 : Pagination

## Item 94: When and Why Offset Pagination May Become a Performance Penalty
- [OffsetPagination](OffsetPagination)

## Item 95: How to Optimize Offset Pagination with `COUNT(*) OVER` and `Page<entity/dto>`
- [PageDtoOffsetPaginationWF](PageDtoOffsetPaginationWF)
- [ListDtoOffsetPaginationWF](ListDtoOffsetPaginationWF)
- [PageEntityOffsetPaginationExtraColumnWF](PageEntityOffsetPaginationExtraColumnWF)
- [ListEntityOffsetPaginationExtraColumnWF](ListEntityOffsetPaginationExtraColumnWF)

## Item 96: How to Optimize Offset Pagination with `SELECT COUNT` subquery and `Page<entity/dto>`
- [PageDtoOffsetPagination](PageDtoOffsetPagination)
- [ListDtoOffsetPagination](ListDtoOffsetPagination)
- [PageEntityOffsetPaginationExtraColumn](PageEntityOffsetPaginationExtraColumn)
- [ListEntityOffsetPaginationExtraColumn](ListEntityOffsetPaginationExtraColumn)

## Item 97: How to Use `JOIN FETCH` and `Pageable`
- [JoinFetchPageable](JoinFetchPageable)

## Item 98: How to Fix HHH000104
- [HHH000104](HHH000104)

## Item 99: How to Implement `Slice<T> findAll()`
- [SliceAllViaFetchAll](SliceAllViaFetchAll)
- [SliceAllSimpleSql](SliceAllSimpleSql)
- [SliceAllCriteriaBuilder](SliceAllCriteriaBuilder)
- [SliceAllCriteriaBuilderAndSort](SliceAllCriteriaBuilderAndSort)
- [SliceAllCriteriaBuilderSortAndSpecification](SliceAllCriteriaBuilderSortAndSpecification)
- [SliceAllCriteriaBuilderSortAndSpecificationAndQueryHints](SliceAllCriteriaBuilderSortAndSpecificationAndQueryHints)
- [SliceAllCriteriaBuilderSimpleJpaRepository](SliceAllCriteriaBuilderSimpleJpaRepository)

## Item 100: How to Implement Keyset Pagination
- [KeysetPagination](KeysetPagination)

## Item 101: How to Add a Next Page Button to Keyset Pagination
- [KeysetPaginationNextPage](KeysetPaginationNextPage)

## Item 102: How to Implement Pagination via `ROW_NUMBER()`
- [PaginationRowNumber](PaginationRowNumber)