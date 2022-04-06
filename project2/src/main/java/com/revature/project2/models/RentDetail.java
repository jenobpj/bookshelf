package com.revature.project2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="rent_detail")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @JoinColumn(name="rent_id")
    @OneToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Rent rent_id;
    @JoinColumn(name="book_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Book book_id;
    @Column(name = "expiry_date")
    private Timestamp expiry_date;
    @Column(name="return_date")
    private  Timestamp return_date;
    @Column(name = "fine_amount")
    private  int fine_amount;

}
