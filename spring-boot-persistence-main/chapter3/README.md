# Chapter 3 : Fetching

## Item 21: How to Use Direct Fetching
- [DirectFetching](DirectFetching)
- [SessionRepeatableReads](SessionRepeatableReads)
- [LoadMultipleIdsSpecification](LoadMultipleIdsSpecification)
- [LoadMultipleIds](LoadMultipleIds)

## Item 22: Why Use Read-Only Entities Whenever You Plan to Propagate Changes to the Database in a Future Persistence Context
- [ReadOnlyQueries](ReadOnlyQueries)

## Item 23: How to Lazy Load the Entity Attributes via Hibernate Bytecode Enhancement
- [AttributeLazyLoadingBasic](AttributeLazyLoadingBasic)
- [AttributeLazyLoadingDefaultValues](AttributeLazyLoadingDefaultValues)
- [AttributeLazyLoadingJacksonSerialization](AttributeLazyLoadingJacksonSerialization)

## Item 24: How to Lazy Load the Entity Attributes via Subentities
- [Subentities](Subentities)

## Item 25: How to Fetch DTO via Spring Projections
- [DtoViaProjectionsIntefaceInRepo](DtoViaProjectionsIntefaceInRepo)
- [DtoViaProjections](DtoViaProjections)
- [DtoViaProjectionsAndJpql](DtoViaProjectionsAndJpql)
- [DtoSpringProjectionAnnotatedNamedQuery](DtoSpringProjectionAnnotatedNamedQuery)
- [DtoSpringProjectionAnnotatedNamedNativeQuery](DtoSpringProjectionAnnotatedNamedNativeQuery)
- [DtoSpringProjectionPropertiesNamedQuery](DtoSpringProjectionPropertiesNamedQuery)
- [DtoSpringProjectionPropertiesNamedNativeQuery](DtoSpringProjectionPropertiesNamedNativeQuery)
- [DtoSpringProjectionOrmXmlNamedQuery](DtoSpringProjectionOrmXmlNamedQuery)
- [DtoSpringProjectionOrmXmlNamedNativeQuery](DtoSpringProjectionOrmXmlNamedNativeQuery)
- [DtoViaClassBasedProjections](DtoViaClassBasedProjections)
- [ReuseProjection](ReuseProjection)
- [DynamicProjection](DynamicProjection)

## Item 26: How to Add an Entity in a Spring Projection
- [DtoEntityViaProjection](DtoEntityViaProjection)
- [DtoEntityViaProjectionNoAssociation](DtoEntityViaProjectionNoAssociation)

## Item 27: How to Enrich Spring Projections with Virtual Properties That Are/Aren’t Part of Entities
- [DtoViaProjectionsAndVirtualProperties](DtoViaProjectionsAndVirtualProperties)

## Item 28: How to Efficiently Fetch Spring Projection Including *-to-One Associations
- [NestedVsVirtualProjection](NestedVsVirtualProjection)

## Item 29: Why to Pay Attention to Spring Projections that Include Associated Collections
- [ProjectionAndCollections](ProjectionAndCollections)

## Item 30: How to Fetch All Entity Attributes via Spring Projection
- [JoinDtoAllFields](JoinDtoAllFields)

## Item 31: How to Fetch DTO via Constructor Expression
- [DtoConstructor](DtoConstructor)
- [DtoConstructorExpression](DtoConstructorExpression)

## Item 32: Why You Should Avoid Fetching Entities in DTO via the Constructor Expression
- [AvoidEntityInDtoViaConstructor](AvoidEntityInDtoViaConstructor)

## Item 33: How to Fetch DTO via a JPA Tuple
- [DtoTupleAndJpql](DtoTupleAndJpql)
- [DtoTupleAndSql](DtoTupleAndSql)

## Item 34: How to Fetch DTO via `@SqlResultSetMapping` and `@NamedNativeQuery`
- [DtoSqlResultSetMappingAndNamedNativeQuery2](DtoSqlResultSetMappingAndNamedNativeQuery2)
- [DtoSqlResultSetMappingAndNamedNativeQuery](DtoSqlResultSetMappingAndNamedNativeQuery)
- [DtoSqlResultSetMappingNamedNativeQueryOrmXml](DtoSqlResultSetMappingNamedNativeQueryOrmXml)
- [DtoViaSqlResultSetMappingEm](DtoViaSqlResultSetMappingEm)
- [DtoSqlResultSetMappingAndNamedNativeQueryEntity2](DtoSqlResultSetMappingAndNamedNativeQueryEntity2)
- [DtoSqlResultSetMappingAndNamedNativeQueryEntity](DtoSqlResultSetMappingAndNamedNativeQueryEntity)
- [DtoResultTransformerJpql](DtoResultTransformerJpql)
- [DtoResultTransformer](DtoResultTransformer)

## Item 36: How to Fetch DTO via a custom `ResultTransformer`
- [DtoCustomResultTransformer](DtoCustomResultTransformer)

## Item 37: How to Map an Entity to a Query via `@Subselect`
- [Subselect](Subselect)

## Item 38: How to Fetch DTO via Blaze-Persistence Entity Views
- [DtoBlazeEntityView](DtoBlazeEntityView)

## Item 39: How to Effectively Fetch Parent and Association in One `SELECT`
- [JoinFetch](JoinFetch)

## Item 40: How to Decide Between `JOIN` and `JOIN FETCH`
- [JoinVSJoinFetch](JoinVSJoinFetch)

## Item 41: How to Fetch All Left Entities
- [LeftJoinFetch](LeftJoinFetch)

## Item 42: How to Fetch DTO from Unrelated Entities
- [DtoUnrelatedEntities](DtoUnrelatedEntities)

## Item 43: How to Write `JOIN` Statements
- [DtoViaInnerJoins](DtoViaInnerJoins)
- [DtoViaLeftJoins](DtoViaLeftJoins)
- [DtoViaLeftExcludingJoins](DtoViaLeftExcludingJoins)
- [DtoViaRightJoins](DtoViaRightJoins)
- [DtoViaRightExcludingJoins](DtoViaRightExcludingJoins)
- [DtoViaCrossJoins](DtoViaCrossJoins)
- [DtoViaFullJoins](DtoViaFullJoins)
- [DtoViaFullOuterExcludingJoins](DtoViaFullOuterExcludingJoins)
- [DtoViaFullJoinsMySQL](DtoViaFullJoinsMySQL)

## Item 44: How to Paginate `JOIN`s
- [JoinPagination](JoinPagination)

## Item 45: How to Stream the Result Set (in MySQL) and How to Use the Streamable Utility
- [StreamAndMySQL](StreamAndMySQL)
- [Streamable](Streamable)
- [WrapperTypeStreamable](WrapperTypeStreamable)