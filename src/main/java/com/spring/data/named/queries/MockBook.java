package com.spring.data.named.queries;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Ghazi Naceur on 25/06/2017.
 */
@Entity
@Table(name = "MockBook")
@NamedQueries({ @NamedQuery(name = "MockBook.queryOne", query = "select b from MockBook b"),
                @NamedQuery(name = "MockBook.queryTwo", query = "select b from MockBook b where b.pageCount > ?1"),
                @NamedQuery(name = "MockBook.queryThree", query = "select b from MockBook b where b.title = :title")})
public class MockBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "title")
    private String title;

    @Temporal(TemporalType.DATE)
    @Column(name = "publish_date")
    private Date publishDate;

    @Column(name = "page_count")
    private int pageCount;

    @Column(name = "price")
    private BigDecimal price;

    public MockBook() {
        super();
    }

    public MockBook(Long bookId, String title, Date publishDate, int pageCount, BigDecimal price) {
        this.bookId = bookId;
        this.title = title;
        this.publishDate = publishDate;
        this.pageCount = pageCount;
        this.price = price;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MockBook{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", publishDate=" + publishDate +
                ", pageCount=" + pageCount +
                ", price=" + price +
                '}';
    }
}
