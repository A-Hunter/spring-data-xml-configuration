package com.spring.data;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Ghazi Naceur on 23/06/2017.
 */
public class Application {

    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml")){
                BookService service = context.getBean(BookService.class);
                Book book = new Book();
                book.setTitle("A book about something");
                book.setPageCount(300);
                book.setPublishDate(new Date());
                book.setPrice(BigDecimal.valueOf(8500));

                service.save(book);
        }

    }
}
