package com.spring.data.customs.base.repository;

import com.spring.data.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ghazi Naceur on 25/06/2017.
 */
@NoRepositoryBean
public interface BaseRepository<T,ID extends Serializable> extends JpaRepository<T,ID> {

    List<T> findByIds(ID...ids);
}
