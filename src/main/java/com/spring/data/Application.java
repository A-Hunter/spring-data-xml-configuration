package com.spring.data;

import com.spring.data.customs.asynchronous.queries.AsynchronousCustomizedBookRepository;
import com.spring.data.customs.auditing.FakeBook;
import com.spring.data.customs.auditing.FakeBookRepository;
import com.spring.data.customs.base.repository.CustomizedBookRepository;
import com.spring.data.customs.modifying.queries.FakeBaseRepository;
import com.spring.data.derived.queries.DerivedQueriesBookRepository;
import com.spring.data.named.queries.MockBook;
import com.spring.data.named.queries.NamedQueriesBookRepository;
import com.spring.data.paging.results.PagingResultsBookRepository;
import com.spring.data.query.method.returnn.types.QueryMethodReturnTypesBookRepository;
import com.spring.data.sorting.results.SortingResultsBookRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;

import java.util.Collection;
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
//        DerivedQueriesBookRepository derivedQueriesBookRepository = context.getBean(DerivedQueriesBookRepository.class);
//        List<Book> b = derivedQueriesBookRepository.findByTitleLike("That book");
//        List<Book> b = derivedQueriesBookRepository.findByTitleContaining("That book");
//        List<Book> b = derivedQueriesBookRepository.findByTitleStartingWith("That");
//        List<Book> b = derivedQueriesBookRepository.findByTitleEndingWith("book");
//        List<Book> b = derivedQueriesBookRepository.findByTitleIgnoreCase("That book");
//        b.forEach(System.out::println);

        // Derived Queries : Relational Operators
//        DerivedQueriesRelationalOperatorsBookRepository rep = context.getBean(DerivedQueriesRelationalOperatorsBookRepository.class);
//        List<Book> books = rep.findByPageCountEquals(200);
//        List<Book> books = rep.findByPageCountGreaterThan(300);
//        List<Book> books = rep.findByPageCountLessThan(300);
//        List<Book> books = rep.findByPageCountBetween(200,300);
//        books.forEach(System.out::println);

        // Derived Queries : Logical Operators
//        DerivedQueriesLogicalOperatorsBookRepository r = context.getBean(DerivedQueriesLogicalOperatorsBookRepository.class);
//        List<Book> books = r.findByTitleContainingOrTitleContaining("A", "That");
//        List<Book> books = r.findByTitleContainingAndPageCountGreaterThan("That", 500);
//        List<Book> books = r.findByTitleNot("That book");
//        books.forEach(System.out::println);

        // Derived Queries : Date Comparisons
//        DerivedQueriesDateComparisonsBookRepository rep = context.getBean(DerivedQueriesDateComparisonsBookRepository.class);
//        Date date1 = null;
//        Date date2 = null;
//        try {
//            date1 = new SimpleDateFormat("yyyy-MM-dd").parse("2005-01-01");
//            date2 = new SimpleDateFormat("yyyy-MM-dd").parse("2003-01-01");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        List<Book> books = rep.findByPublishDate(date1);
//        List<Book> books = rep.findByPublishDateAfter(date2);
//        List<Book> books = rep.findByPublishDateBefore(date2);
//        List<Book> books = rep.findByPublishDateBetween(date2, date1);
//        books.forEach(System.out::println);

        // Derived Queries : Ordering results
//        DerivedQueriesOrderingResultsBookRepository rep = context.getBean(DerivedQueriesOrderingResultsBookRepository.class);
//        List<Book> books = rep.findByTitleContainingOrderByTitleAsc("A");
//        List<Book> books = rep.findByTitleContainingOrderByTitleAsc("A");
//        List<Book> books = rep.findFirstByOrderByPageCountAsc();
//        List<Book> books = rep.findTop5ByOrderByPriceDesc();
//        List<Book> books = rep.findTop5ByTitleOrderByPriceAsc("That book");
//        List<Book> books = rep.findTopByOrderByPageCountDesc();
//        books.forEach(System.out::println);

        // Query annotations
//        QueryAnnotationBookRepository rep = context.getBean(QueryAnnotationBookRepository.class);
//        List<Book> books = rep.queryOne();
//        List<Book> books = rep.queryTwo(300);
//        List<Book> books = rep.queryThree("That book");
//        books.forEach(System.out::println);

        // Named queries
//        NamedQueriesBookRepository rep = context.getBean(NamedQueriesBookRepository.class);
//        List<MockBook> books = rep.queryOne();
//        List<MockBook> books = rep.queryTwo(300);
//        List<MockBook> books = rep.queryThree("That book");
//        books.forEach(System.out::println);

        // Paging Results
//        PagingResultsBookRepository rep = context.getBean(PagingResultsBookRepository.class);
//        Page<MockBook> books = rep.findAll(new PageRequest(0, 3));
//        List<MockBook> books = rep.findByPageCountGreaterThan(300, new PageRequest(0, 2));
//        books.forEach(System.out::println);

        // Sorting Results
//        SortingResultsBookRepository rep = context.getBean(SortingResultsBookRepository.class);
//        List<MockBook> books = rep.findAll(new Sort("price"));
//        List<MockBook> books = rep.findAll(new Sort(Sort.Direction.ASC,"price"));
//        List<MockBook> books = rep.findAll(new Sort(Sort.Direction.DESC,"price"));
//        List<MockBook> books = rep.findAll(new Sort(Sort.Direction.DESC, "publishDate","price"));
//        List<MockBook> books = rep.findAll(new Sort(Sort.Direction.DESC, "publishDate")
//                                        .and(new Sort(Sort.Direction.DESC,"price")));
//        List<MockBook> books = rep.findByPageCountGreaterThan(300, new Sort(Sort.Direction.ASC, "price"));
//        List<MockBook> books = rep.findByPageCountGreaterThan(300, new PageRequest(0, 2));
//        books.forEach(System.out::println);

        // Query method return types
//        QueryMethodReturnTypesBookRepository rep = context.getBean(QueryMethodReturnTypesBookRepository.class);
//        Collection<MockBook> books = rep.findByPageCountGreaterThan(300, new Sort(Sort.Direction.ASC, "price"));
//        Iterable<MockBook> books = rep.findByPageCountLessThan(300, new Sort(Sort.Direction.ASC, "price"));
//        Page<MockBook> books = rep.findByPageCountBetween(100, 500, new PageRequest(0,2));
//        Slice<MockBook> books = rep.findByPageCountGreaterThan(300, new PageRequest(0, 3));
//        books.forEach(System.out::println);

        // Custom Book Repository
//        CustomizedBookRepository rep = context.getBean(CustomizedBookRepository.class);
//        List<Book> books = rep.findByIds(2L, 5L);
//        books.forEach(System.out::println);

        // Asynchronous Customized Book Repository
//        AsynchronousCustomizedBookRepository rep = context.getBean(AsynchronousCustomizedBookRepository.class);
//        List<Book> books = rep.findByIds(3L, 6L);
//        books.forEach(System.out::println);

        // Auditing
//        FakeBookRepository rep = context.getBean(FakeBookRepository.class);
//        FakeBook book = new FakeBook();
//        rep.save(book);
//        System.out.println(rep.findOne(book.getBookId()));

        // Modifying queries
        FakeBaseRepository rep = context.getBean(FakeBaseRepository.class);
//        System.out.println(rep.setPageCount("That book", 450));
        System.out.println(rep.setPageCount("%book%", 450));
        List<FakeBook> books = rep.findAll();
        books.forEach(System.out::println);
    }
}
