# hocviencnttspringehcahe
http://docs.spring.io/spring/docs/current/spring-framework-reference/html/cache.html

For caching declaration, the abstraction provides a set of Java annotations:

@Cacheable triggers cache population
@CacheEvict triggers cache eviction
@CachePut updates the cache without interfering with the method execution
@Caching regroups multiple cache operations to be applied on a method
@CacheConfig shares some common cache-related settings at class-level

@Cacheable is used to demarcate methods that are cacheable 
@Cacheable annotation allows the user to specify how the key is generated through its key attribute
--------------------------------------------------------------------------------------------------------------------
For cases where the cache needs to be updated without interfering with the method execution, 
one can use the @CachePut annotation

--------------------------------------------------------------------------------------------------------------------
Opposed to @Cacheable, annotation @CacheEvict demarcates methods that perform cache eviction, 
that is methods that act as triggers for removing data from the cache
--------------------------------------------------------------------------------------------------------------------
There are cases when multiple annotations of the same type, such as @CacheEvict or @CachePut need to be specified, for example because the condition or the key expression is different between different caches. 
@Caching allows multiple nested @Cacheable, @CachePut and @CacheEvict to be used on the same method:

--------------------------------------------------------------------------------------------------------------------
To enable caching annotations add the annotation @EnableCaching to one of your @Configuration classes:

@Configuration
@EnableCaching
public class AppConfig {
}
Alternatively for XML configuration use the cache:annotation-driven element:

<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:cache="http://www.springframework.org/schema/cache"
    xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/cache http://www.springframework.org/schema/cache/spring-cache.xsd">

        <cache:annotation-driven />

</beans>
--------------------------------------------------------------------------------------------------------------------
Using custom annotations


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Cacheable(cacheNames="books", key="#isbn")
public @interface SlowService {
}

Replace
@Cacheable(cacheNames="books", key="#isbn")
public Book findBook(ISBN isbn, boolean checkWarehouse, boolean includeUsed)

With
@SlowService
public Book findBook(ISBN isbn, boolean checkWarehouse, boolean includeUsed)

