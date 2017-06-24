package com.spring.data.date.comparaisons;

import com.spring.data.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by Ghazi Naceur on 24/06/2017.
 */
@Repository
public interface DerivedQueriesDateComparisonsBookRepository extends JpaRepository<Book, Long> {

    List<Book> findByPublishDate(Date publishDate);
    List<Book> findByPublishDateAfter(Date publishDate);
    List<Book> findByPublishDateBefore(Date publishDate);
    List<Book> findByPublishDateBetween(Date publishDate1, Date publishDate2);

}
