package com.spring.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ghazi Naceur on 24/06/2017.
 */
public class BookUtils {

    public static List<Book> createBooks(int number) {
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Book book = new Book();
            book.setTitle("The book of : " + i);
            books.add(book);
        }
        return books;
    }
}
