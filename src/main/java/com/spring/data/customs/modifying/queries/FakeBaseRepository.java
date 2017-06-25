package com.spring.data.customs.modifying.queries;

import com.spring.data.customs.auditing.FakeBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ghazi Naceur on 25/06/2017.
 */
public interface FakeBaseRepository extends JpaRepository<FakeBook, Long> {

    @Transactional
    @Modifying
    @Query("update FakeBook b set b.pageCount = ?2 where b.title like ?1")
    public int setPageCount(String title, int pageCount);
}
