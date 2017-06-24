package com.spring.data.logical.operators;

import com.spring.data.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ghazi Naceur on 24/06/2017.
 */
@Repository
public interface DerivedQueriesLogicalOperatorsBookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitleContainingOrTitleContaining(String title1, String title2);
    List<Book> findByTitleContainingAndPageCountGreaterThan(String title, int pageCount);
    List<Book> findByTitleNot(String title);
}
