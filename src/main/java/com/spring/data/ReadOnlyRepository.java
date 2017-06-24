package com.spring.data;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

/**
 * Created by Ghazi Naceur on 24/06/2017.
 */
@NoRepositoryBean // prevent spring from building a bean from our custom repository in order to prevent exposing all the method provided by Repository
public interface ReadOnlyRepository<T,ID extends Serializable> extends Repository<T,ID>{

    T findOne(ID id);

    Iterable<T> findAll();
}
