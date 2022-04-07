package com.revature.project2.models;


import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Book")
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id")
    private int book_id;

    @Column(name="book_isbn")
    private String isbn;

    @Column(name="book_title")
    private String title;

    @JoinColumn(name="book_author")
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)//if author is deleted then it will also delete all their books
    private Author author;
    @JoinColumn(name="book_publisher")
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)//if publisher is deleted then it will also delete all their books
    private Publisher publisher;

    @Column(name ="book_pages")
    private int pages;

    @Column(name="publish_date")
    private Timestamp publish_date;

    @Column(name="book_image")
    private String image_url;

    @Column(name="book_genre")
    private String genre;

    @JoinColumn(name="book_status")
    @OneToOne
    private BookStatus bookStatus;


    public Book(int id, String isbn, String title, Author author, Publisher publisher, int pages, Timestamp publish_date, String image_url, String genre, BookStatus bookStatus) {
        this.book_id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.publish_date = publish_date;
        this.image_url = image_url;
        this.genre = genre;
        this.bookStatus = bookStatus;
    }

}
