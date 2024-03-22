# Chapter 14 : Queries

## Item 103: How to Optimize `SELECT DISTINCT` via Hibernate-Specific `HINT_PASS_DISTINCT_THROUGH`
- [HintPassDistinctThrough](HintPassDistinctThrough)

## Item 104: How to Set Up JPA Callbacks
- [JpaCallbacks](JpaCallbacks)
- [EntityListener](EntityListener)

## Item 105: How to Use Spring Data Query Builder to limit the Result Set Size and to Count and Delete Derived Queries
- [LimitResultSizeViaQueryCreator](LimitResultSizeViaQueryCreator)
- [DerivedCountAndDelete](DerivedCountAndDelete)

## Item 106: Why You Should Avoid Time-Consuming Tasks in Post-Commits
- [PostCommit](PostCommit)

## Item 107: How to Avoid Redundant `save()` Calls
- [RedundantSave](RedundantSave)

## Item 108: Why and How to Prevent N+1 Issues
- [SimulateNPlus1](SimulateNPlus1)
- [FetchJoinAndQueries](FetchJoinAndQueries)

## Item 109: How to Use Hibernate-Specific Soft Deletes Support
- [SoftDeletes](SoftDeletes)

## Item 110: Why and How to Avoid the OSIV Anti-Pattern
- [JacksonHibernate5Module](JacksonHibernate5Module)
- [SuppressLazyInitInOpenSessionInView](SuppressLazyInitInOpenSessionInView)
- [EnableLazyLoadNoTrans](EnableLazyLoadNoTrans)

## Item 111: How to Store Date/Time in UTC Time Zone (MySQL)
- [UTCTimezone](UTCTimezone)

## Item 112: How to Shuffle Small Result Sets via `ORDER BY RAND()`
- [OrderByRandom](OrderByRandom)

## Item 113: How to Use Subqueries in the `WHERE/HAVING` Clause
- [SubqueryInWhere](SubqueryInWhere)
- [ResultSetMap](ResultSetMap)

## Item 114: How to Call a Stored Procedure
- [CallStoredProcedureReturnValue](CallStoredProcedureReturnValue)
- [CallStoredProcedureJdbcTemplateBeanPropertyRowMapper](CallStoredProcedureJdbcTemplateBeanPropertyRowMapper)
- [CallStoredProcedureJdbcTemplate](CallStoredProcedureJdbcTemplate)
- [CallStoredProcedureNativeCall](CallStoredProcedureNativeCall)
- [CallStoredProcedureReturnResultSet](CallStoredProcedureReturnResultSet)

## Item 115: How to Unproxy a Proxy
- [UnproxyAProxy](UnproxyAProxy)

## Item 116: How to Map a Database View
- [DatabaseView](DatabaseView)

## Item 117: How to Update a Database View
- [DatabaseViewUpdateInsertDelete](DatabaseViewUpdateInsertDelete)

## Item 118: Why and How to Use `WITH CHECK OPTION`
- [DatabaseViewWithCheckOption](DatabaseViewWithCheckOption)

## Item 119: How to Efficiently Assign a Database Temporary Ranking to Rows
- [AssignSequentialNumber](AssignSequentialNumber)
- [RankFunction](RankFunction)
- [DenseRankFunction](DenseRankFunction)
- [NTilleFunction](NTilleFunction)

## Item 120: How to Efficiently Find Top N Rows of Every Group
- [TopNRowsPerGroup](TopNRowsPerGroup)

## Item 121: How to Implement Advanced Search via Specification API
- [SearchViaSpecifications](SearchViaSpecifications)

## Item 122: How to Enhance SQL Statement Caching via `IN` Clause Parameter Padding
- [INListPadding](INListPadding)
> **Note**  
> Item 122 예제는 MS SQL Server가 필요합니다.

## Item 123: How to Create Specification Query Fetch Joins
- [SpecificationQueryFetchJoins](SpecificationQueryFetchJoins)

## Item 124: How to Use a Hibernate-Specific Query Plan Cache
- [QueryPlanCache](QueryPlanCache)

## Item 125: How to Check if a Transient Entity Exists in the Database via Spring Query By Example (QBE)
- [ExampleApi](ExampleApi)

## Item 126: How to Include in the `UPDATE` Statement Only the Modified Columns via Hibernate `@DynamicUpdate`
- [DynamicUpdate](DynamicUpdate)

## Item 127: How to Use Named (Native) Queries in Spring
- [NamedQueriesViaAnnotations](NamedQueriesViaAnnotations)
- [NamedQueriesInPropertiesFile](NamedQueriesInPropertiesFile)
- [NamedQueriesInOrmXml](NamedQueriesInOrmXml)

## Item 128: The Best Way to Fetch Parent and Children in Different Queries/Requests
- [PropertyExpressions](PropertyExpressions)
- [ParentChildSeparateQueries](ParentChildSeparateQueries)

## Item 129: How to Optimize the Merge Operation Using Update
- [SaveAndMerge](SaveAndMerge)

## Item 130: How to Implement Concurrent Table Based Queues via the `SKIP LOCKED` Option
- [MySqlSkipLocked](MySqlSkipLocked)
- [PostgresSqlSkipLocked](PostgresSqlSkipLocked)

## Item 131: How to Retry the Transaction After a Versioned (`@Version`) `OptimisticLockException`
- [SimulateVersionedOptimisticLocking](SimulateVersionedOptimisticLocking)
- [RetryVersionedOptimisticLocking](RetryVersionedOptimisticLocking)
- [RetryVersionedOptimisticLockingTT](RetryVersionedOptimisticLockingTT)

## Item 132: How to Retry a Transaction After a Versionless `OptimisticLockException`
- [SimulateVersionlessOptimisticLocking](SimulateVersionlessOptimisticLocking)
- [RetryVersionlessOptimisticLocking](RetryVersionlessOptimisticLocking)
- [RetryVersionlessOptimisticLockingTT](RetryVersionlessOptimisticLockingTT)

## Item 133: How to Handle Versioned Optimistic Locking and Detached Entities
- [VersionedOptimisticLockingAndDetachedEntity](VersionedOptimisticLockingAndDetachedEntity)

## Item 134: How to Use the Optimistic Locking Mechanism and Detached Entities in long HTTP Conversations
- [HTTPLongConversationDetachedEntity](HTTPLongConversationDetachedEntity)

## Item 135: How to Increment the Version of the Locked Entity Even If this Entity Was Not Modified
- [OptimisticForceIncrement](OptimisticForceIncrement)
- [PessimisticForceIncrement](PessimisticForceIncrement)

## Item 136: How `PESSIMISTIC_READ/WRITE` Works
- [PessimisticLocks](PessimisticLocks)

## Item 137: How `PESSIMISTIC_WRITE` Works with `UPDATE/INSERT` and `DELETE` Operations
- [PessimisticLocksDelInsUpd](PessimisticLocksDelInsUpd)