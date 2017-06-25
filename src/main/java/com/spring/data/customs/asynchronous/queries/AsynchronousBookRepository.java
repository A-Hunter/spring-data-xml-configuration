package com.spring.data.customs.asynchronous.queries;

import com.spring.data.customs.base.repository.BaseRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Ghazi Naceur on 25/06/2017.
 */
public class AsynchronousBookRepository<T, ID extends Serializable> extends SimpleJpaRepository<T, ID>
        implements AsynchronousBaseRepository<T, ID> {

    private JpaEntityInformation<T, ?> entityInformation;

    private EntityManager entityManager;

    public AsynchronousBookRepository(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityInformation = entityInformation;
        this.entityManager = entityManager;
    }

    @Override
    public List<T> findByIds(ID[] ids) {

        Query query = this.entityManager.createQuery("select e from " + this.entityInformation.getEntityName()
                + " e where e." + this.entityInformation.getIdAttribute().getName() + " in :ids");
        query.setParameter("ids", Arrays.asList(ids));

        long wait = new Random().nextInt(10000 - 1) + 1;
        System.out.println("Waiting time : " + wait);
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Executing query for ids : " + Arrays.toString(ids));

        // We move to application-context.xml to add the spring task : xmlns :
        //              <task:executor id="executor" pool-size="10"/>
        //              <task:annotation-driven/>
        // We change the base-class as well to support the new implementation
        return (List<T>) query.getResultList();
    }

}
