package com.revature.project2.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name ="last_name")
    private String lastname;

    @Column(name="dob")
    private Timestamp dob;

    @Column(name="bio")
    private String bio;

    @Column(name = "top_work")
    private String top_work;

    @Column(name = "image_url")
    private String image_url;

    public Author() {
    }

    public Author(int id, String firstname, String lastname, Timestamp dob, String bio, String top_work, String image_url) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.bio = bio;
        this.top_work = top_work;
        this.image_url = image_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Timestamp getDob() {
        return dob;
    }

    public void setDob(Timestamp dob) {
        this.dob = dob;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getTop_work() {
        return top_work;
    }

    public void setTop_work(String top_work) {
        this.top_work = top_work;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id && Objects.equals(firstname, author.firstname) && Objects.equals(lastname, author.lastname) && Objects.equals(dob, author.dob) && Objects.equals(bio, author.bio) && Objects.equals(top_work, author.top_work) && Objects.equals(image_url, author.image_url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, dob, bio, top_work, image_url);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dob='" + dob + '\'' +
                ", bio='" + bio + '\'' +
                ", top_work='" + top_work + '\'' +
                ", image_url='" + image_url + '\'' +
                '}';
    }
}
