package com.spring.data.query.method.returnn.types;

import com.spring.data.named.queries.MockBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * Created by Ghazi Naceur on 25/06/2017.
 */
@Repository
public interface QueryMethodReturnTypesBookRepository extends JpaRepository<MockBook, Long> {

    Collection<MockBook> findByPageCountGreaterThan(int pageCount, Sort sort);
    Iterable<MockBook> findByPageCountLessThan(int pageCount, Sort sort);
    Page<MockBook> findByPageCountBetween(int pageCount1, int pageCount2, Pageable page);
    Slice<MockBook> findByPageCountGreaterThan(int pageCount, Pageable page);
}
