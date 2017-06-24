package com.spring.data.derived.queries;

import com.spring.data.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ghazi Naceur on 24/06/2017.
 */
@Repository
public interface DerivedQueriesBookRepository extends JpaRepository<Book, Long> {

    Book findByTitle(String Title);

    List<Book> findByTitleLike(String title);

    List<Book> findByTitleContaining(String title);

    List<Book> findByTitleStartingWith(String title);

    List<Book> findByTitleEndingWith(String title);

    List<Book> findByTitleIgnoreCase(String title);
}
