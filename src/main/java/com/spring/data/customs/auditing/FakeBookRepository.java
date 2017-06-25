package com.spring.data.customs.auditing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ghazi Naceur on 25/06/2017.
 */
@Repository
public interface FakeBookRepository extends JpaRepository<FakeBook, Long> {

}
