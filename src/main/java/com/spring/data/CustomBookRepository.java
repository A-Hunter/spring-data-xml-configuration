package com.spring.data;

import org.springframework.stereotype.Repository;

/**
 * Created by Ghazi Naceur on 24/06/2017.
 */
@Repository
public interface CustomBookRepository extends ReadOnlyRepository<Book, Long> {
}
