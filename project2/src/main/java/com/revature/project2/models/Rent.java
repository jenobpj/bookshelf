package com.revature.project2.models;


import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="rent")

public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @JoinColumn(name="render_id")
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User render_id;

    @JoinColumn(name="liberian_id")
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User liberian_id;


   @Column(name="rent_date")
   private Timestamp rent_date;

}
