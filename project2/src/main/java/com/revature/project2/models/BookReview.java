package com.revature.project2.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="book_review")
@NoArgsConstructor
@Data
public class BookReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @JoinColumn(name = "book_id")
    @ManyToOne
    private Book book_id;

    @Column(name ="ratings")
    private int  rating;

    @JoinColumn(name="user_id")
    @OneToOne
    private User user_id;

    @Column(name="feedback")
    private  String feedback;
}
