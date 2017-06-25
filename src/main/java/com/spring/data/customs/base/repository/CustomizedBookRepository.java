package com.spring.data.customs.base.repository;

import com.spring.data.Book;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ghazi Naceur on 25/06/2017.
 */
@Repository
public interface CustomizedBookRepository extends BaseRepository<Book, Long>{
    // we insert in <jpa:repositories> tag this instruction to specify the base class for our
    // custom book repository implementation :
    // (base-class="com.spring.data.customs.base.repository.ExtendedBookRepository")

    List<Book> findByPageCountGreaterThan(int pageCount, Sort sort);
}
