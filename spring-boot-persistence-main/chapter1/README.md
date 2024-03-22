# Chapter 1 : Assoications

## Item 1: How to Effectively Shape the `@OneToMany` Association
- [OneToManyBidirectional](OneToManyBidirectional)

## Item 2: Why You Should Avoid the Unidirectional `@OneToMany` Association
- [OneToManyUnidirectional](OneToManyUnidirectional)

## Item 3: How Efficient Is the Unidirectional `@ManyToOne`
- [JustManyToOne](JustManyToOne)

## Item 4: How to Effectively Shape the `@ManyToMany` Association
- [ManyToManyBidirectional](ManyToManyBidirectional)

## Item 5: Why Set Is Better than List in `@ManyToMany`
- [ManyToManyBidirectionalListVsSet](ManyToManyBidirectionalListVsSet)
- [ManyToManySetAndOrderBy](ManyToManySetAndOrderBy)

## Item 6: Why and When to Avoid Removing Child Entities with `CascadeType.Remove` and `orphanRemoval=true`
- [CascadeChildRemoval](CascadeChildRemoval)

## Item 7: How to Fetch Associations via JPA Entity Graphs
- [NamedEntityGraph](NamedEntityGraph)
- [EntityGraphAttributePaths](EntityGraphAttributePaths)

## Item 8: How to Fetch Associations via Entity Sub-Graphs
- [NamedSubgraph](NamedSubgraph)

## Item 9: How to Handle Entity Graphs and Basic Attributes
- [NamedEntityGraphBasicAttrs](NamedEntityGraphBasicAttrs)

## Item 10: How to Filter Associations via a Hibernate-Specific `@Where` Annotation
- [FilterAssociation](FilterAssociation)

## Item 11: How to Optimize Unidirectional/Bidirectional `@OneToOne` via `@MapsId`
- [OneToOneMapsId-addendum](OneToOneMapsId-addendum) : `@OneToOne` 사용 추가 예제
- [OneToOneMapsId](OneToOneMapsId)

## Item 12: How to Validate that Only One Association Is Non-Null
- [ChooseOnlyOneAssociation](ChooseOnlyOneAssociation)
> **Warning**  
> Trigger 생성을 포함하며, 다음과 같은 오류가 발생할 수 있습니다.    
> `You do not have the SUPER privilege and binary logging is enabled (you *might* want to use the less safe log_bin_trust_function_creators variable)`  
> 
> 이 경우 root 권한으로 다음과 같이 확인 및 조치해 주시면 됩니다.    
> `show global variables like 'log_bin_trust_function_creators';`  
>  OFF이면 다음과 같이 실행 해주세요.   
> `SET GLOBAL log_bin_trust_function_creators=ON;`
