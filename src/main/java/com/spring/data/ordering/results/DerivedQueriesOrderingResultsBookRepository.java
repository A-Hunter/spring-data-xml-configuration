package com.spring.data.ordering.results;

import com.spring.data.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ghazi Naceur on 25/06/2017.
 */
@Repository
public interface DerivedQueriesOrderingResultsBookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitleContainingOrderByTitleAsc(String title);
    List<Book> findByTitleContainingOrderByTitleDesc(String title);

    List<Book> findTopByOrderByPageCountDesc();
    // The same as : Top or First :
    List<Book> findFirstByOrderByPageCountAsc();

    List<Book> findTop5ByOrderByPriceDesc();
    List<Book> findTop5ByTitleOrderByPriceAsc(String title);
}
