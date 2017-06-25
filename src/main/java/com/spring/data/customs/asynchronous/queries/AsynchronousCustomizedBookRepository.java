package com.spring.data.customs.asynchronous.queries;

import com.spring.data.Book;
import com.spring.data.customs.base.repository.BaseRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ghazi Naceur on 25/06/2017.
 */
@Repository
public interface AsynchronousCustomizedBookRepository extends BaseRepository<Book, Long> {

    List<Book> findByPageCountGreaterThan(int pageCount, Sort sort);
}
