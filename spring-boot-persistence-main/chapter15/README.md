# Chapter 15 : Inheritance

## Item 138: How to Efficiently Use Single Table Inheritance
- [SingleTableRepositoryInheritance](SingleTableRepositoryInheritance)
- [DatabaseTriggers](DatabaseTriggers)
> **Warning**  
> Trigger 생성을 포함하며, 다음과 같은 오류가 발생할 수 있습니다.    
> `You do not have the SUPER privilege and binary logging is enabled (you *might* want to use the less safe log_bin_trust_function_creators variable)`  
> 
> 이 경우 root 권한으로 다음과 같이 확인 및 조치해 주시면 됩니다.    
> `show global variables like 'log_bin_trust_function_creators';`  
>  OFF이면 다음과 같이 실행 해주세요.   
> `SET GLOBAL log_bin_trust_function_creators=ON;`
- [SingleTableInheritance](SingleTableInheritance)

## Item 139: How to Fetch Certain Subclasses from a `SINGLE_TABLE` Inheritance Hierarchy
- [SpecificSubclassFromInheritance](SpecificSubclassFromInheritance)

## Item 140: How to Efficiently Use Join Table Inheritance
- [JoinTableRepositoryInheritance](JoinTableRepositoryInheritance)
- [JoinTableInheritance](JoinTableInheritance)
- [JoinedAndStrategy](JoinedAndStrategy)
- [JoinedAndVisitor](JoinedAndVisitor)

## Item 141: How to Efficiently Use Table-Per-Class Inheritance
- [TablePerClassRepositoryInheritance](TablePerClassRepositoryInheritance)
- [TablePerClassInheritance](TablePerClassInheritance)

## Item 142: How to Efficiently Use `@MappedSuperclass`
- [MappedSuperclass](MappedSuperclass)
- [MappedSuperclassRepository](MappedSuperclassRepository)