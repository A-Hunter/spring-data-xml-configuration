package com.spring.data;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Ghazi Naceur on 23/06/2017.
 */
public class Application {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BookRepository repo = context.getBean(BookRepository.class);

        // finOne
        Book book = repo.findOne(1L);
        System.out.println(book.toString());

        // findAll
        List<Book> books = repo.findAll();
        books.forEach(System.out::println);

        //findAll with arguments
        List<Book> bs = repo.findAll(new ArrayList<Long>() {{
            add(1L);
            add(3L);
            add(5L);
        }});
        bs.forEach(System.out::println);
    }
}
