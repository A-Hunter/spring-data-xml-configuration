package com.spring.data.relational.operators;

import com.spring.data.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ghazi Naceur on 24/06/2017.
 */
@Repository
public interface DerivedQueriesRelationalOperatorsBookRepository extends JpaRepository<Book, Long> {

    List<Book> findByPageCountEquals(int pageCount);
    List<Book> findByPageCountGreaterThan(int pageCount);
    List<Book> findByPageCountGreaterThanEqual(int pageCount);
    List<Book> findByPageCountLessThan(int pageCount);
    List<Book> findByPageCountLessThanEqual(int pageCount);
    List<Book> findByPageCountBetween(int min, int max);
}
