package com.spring.data;

import com.spring.data.derived.queries.DerivedQueriesBookRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


/**
 * Created by Ghazi Naceur on 23/06/2017.
 */
public class Application {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BookRepository repo = context.getBean(BookRepository.class);

//        // finOne
//        Book book = repo.findOne(1L);
//        System.out.println(book.toString());
//
//        // findAll
//        List<Book> books = repo.findAll();
//        books.forEach(System.out::println);
//
//        // findAll with arguments
//        List<Book> bs = repo.findAll(new ArrayList<Long>() {{
//            add(1L);
//            add(3L);
//            add(5L);
//        }});
//        bs.forEach(System.out::println);

        // save
//        Book newBook = new Book();
//        newBook.setTitle("A new book");
//        newBook.setPublishDate(new Date());
//        newBook.setPageCount(500);
//        newBook.setPrice(BigDecimal.valueOf(8.500));
//        repo.save(newBook);
//        List<Book> all = repo.findAll();
//        all.forEach(System.out::println);
//
//        List<Book> books = BookUtils.createBooks(5);
//        repo.save(books);
//        List<Book> bookList = repo.findAll();
//        bookList.forEach(System.out::println);

        // update
//        Book book = repo.findOne(2L);
//        book.setTitle("This is a new title");
//        repo.save(book);
//        List<Book> books = repo.findAll();
//        books.forEach(System.out::println);

        // delete
//        repo.delete(1L);
//        repo.delete(repo.findOne(3L));
//        repo.delete(repo.findAll(new ArrayList<Long>(){{
//            add(4L);
//            add(5L);
//        }}));
//        repo.deleteInBatch(repo.findAll(new ArrayList<Long>(){{
//            add(6L);
//            add(7L);
//        }})); // deleting in a single query
//        List<Book> books = repo.findAll();
//        books.forEach(System.out::println);

        // Custom Repository
//        CustomBookRepository rep = context.getBean(CustomBookRepository.class);
//        Book book = (Book) rep.findOne(1L);
//        System.out.println(book);
//
//        List<Book> bookList = (List<Book>) rep.findAll();
//        bookList.forEach(System.out::println);

        // Derived Queries
        DerivedQueriesBookRepository derivedQueriesBookRepository = context.getBean(DerivedQueriesBookRepository.class);
        List<Book> b = (List<Book>) derivedQueriesBookRepository.findByTitle("That book");
        b.forEach(System.out::println);
    }
}
