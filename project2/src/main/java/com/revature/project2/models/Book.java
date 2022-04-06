package com.revature.project2.models;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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

    public Book() {
    }

    public Book(int id, String isbn, String title, Author author, Publisher publisher, int pages, Timestamp publish_date, String image_url, String genre, BookStatus bookStatus) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Timestamp getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(Timestamp publish_date) {
        this.publish_date = publish_date;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", publisher=" + publisher +
                ", pages=" + pages +
                ", publish_date=" + publish_date +
                ", image_url='" + image_url + '\'' +
                ", genre='" + genre + '\'' +
                ", bookStatus=" + bookStatus +
                '}';
    }
}
