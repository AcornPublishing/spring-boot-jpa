# Chapter 4 : Batching

## Item 46: How to Batch Inserts in Spring Boot Style
- [BatchInsertsJpaRepository](BatchInsertsJpaRepository)
- [BatchInsertsSpringStyleBatchPerTransaction](BatchInsertsSpringStyleBatchPerTransaction)
- [BatchInsertsEntityManagerViaJpaContext](BatchInsertsEntityManagerViaJpaContext)
- [BatchInsertsSpringStyle](BatchInsertsSpringStyle)
- [BatchInsertsEntityManager](BatchInsertsEntityManager)

## Item 47: How to Optimize Batch Inserts of Parent-Child Relationships
- [BatchInsertOrderBatchPerTransaction](BatchInsertOrderBatchPerTransaction)
- [BatchInsertOrder](BatchInsertOrder)

## Item 48: How to Control Batch Size at the Session Level
- [BatchInsertsViaSessionPerTransaction](BatchInsertsViaSessionPerTransaction)
- [BatchInsertsViaSession](BatchInsertsViaSession)

## Item 49: How to Fork-Join JDBC Batching
- [BatchJsonFileForkJoin](BatchJsonFileForkJoin)
> **Note**  
> 실행 시 `citylots.json`이 필요하며, 제공된 `citylots_200000_lines.zip` 파일을 압축 해제 후 사용하시면 됩니다. 

## Item 50: Batching Entities via `CompletableFuture`
- [ChunkList](ChunkList)
- [BatchInsertsCompletableFuture](BatchInsertsCompletableFuture)

## Item 51: How to Efficiently Batch Updates
- [BatchUpdateOrderSingleEntity](BatchUpdateOrderSingleEntity)
- [BatchUpdateOrder](BatchUpdateOrder)
- [BulkUpdates](BulkUpdates)

## Item 52: How to Efficiently Batch Deletes (No Associations)
- [ChunkList](ChunkList)
- [BatchDeleteSingleEntity](BatchDeleteSingleEntity)

## Item 53: How to Efficiently Batch Deletes (with Associations)
- [BatchDeleteOrphanRemoval](BatchDeleteOrphanRemoval)
- [BatchDeleteCascadeDelete](BatchDeleteCascadeDelete)

## Item 54: How to Fetch Association in Batches
- [LoadBatchAssociation](LoadBatchAssociation)

## Item 55: Why to Avoid PostgreSQL `(BIG)SERIAL` in Batching Inserts via Hibernate
- [BatchingAndSerial](BatchingAndSerial)
> **Note**  
> 헤당 예제 코드에서는 간단한 테스트를 위해 `increment_size`을 `10`으로 사용했지만, 도서에서는 `1000`으로 설명됩니다. 
