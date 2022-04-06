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


    @Column(name="render_id")
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Users render_id;

    @Column(name="render_id")
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Users liberian_id;


   @Column(name="rent_date")
   private Timestamp rent_date;

}
