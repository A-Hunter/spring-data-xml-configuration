package com.spring.data.sorting.results;

import com.spring.data.named.queries.MockBook;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ghazi Naceur on 25/06/2017.
 */
@Repository
public interface SortingResultsBookRepository extends JpaRepository<MockBook, Long> {

    List<MockBook> findByPageCountGreaterThan(int pageCount, Sort sort);
}
