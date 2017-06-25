package com.spring.data.customs.asynchronous.queries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.scheduling.annotation.Async;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ghazi Naceur on 25/06/2017.
 */
@NoRepositoryBean
public interface AsynchronousBaseRepository<T,ID extends Serializable> extends JpaRepository<T,ID> {

    @Async // to indicate that functions should be executed in a parallel type of nature
    List<T> findByIds(ID...ids);
}
