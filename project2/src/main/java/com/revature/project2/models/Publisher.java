package com.revature.project2.models;

import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "publisher")
@NoArgsConstructor
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private String publisherName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}
