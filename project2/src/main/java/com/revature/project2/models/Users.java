package com.revature.project2.models;

public class Users {
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private UserRole userRole;
    private String address;
    private String phone;

    public Users() {
    }

    public Users(int id, String email, String firstName, String lastName, UserRole userRole, String address, String phone) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userRole = userRole;
        this.address = address;
        this.phone = phone;
    }

    public Users(String email, String firstName, String lastName, UserRole userRole, String address, String phone) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userRole = userRole;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userRole=" + userRole +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
