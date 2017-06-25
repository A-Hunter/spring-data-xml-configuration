package com.spring.data.annotations;

import com.spring.data.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ghazi Naceur on 25/06/2017.
 */
@Repository
public interface QueryAnnotationBookRepository extends JpaRepository<Book, Long> {

    @Query("select b from Book b")
    List<Book> queryOne();

    @Query("select b from Book b where b.pageCount > ?1")
    List<Book> queryTwo(int pageCount);

    @Query("select b from Book b where b.title = :title")
    List<Book> queryThree(@Param("title") String title);
}
