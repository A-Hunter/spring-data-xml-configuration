package com.spring.data.named.queries;

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
public interface NamedQueriesBookRepository extends JpaRepository<MockBook, Long> {

    List<MockBook> queryOne();

    List<MockBook> queryTwo(int pageCount);

    List<MockBook> queryThree(@Param("title") String title);
}
