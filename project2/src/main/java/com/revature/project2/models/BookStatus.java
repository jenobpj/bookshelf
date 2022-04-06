package com.revature.project2.models;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data
@Entity
@Table(name = "Book_Status")
public class BookStatus {
    @Column(name = "status_id")
    private int id;
    @Column(name="status")
    private String status;
}
