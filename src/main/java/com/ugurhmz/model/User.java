package com.ugurhmz.model;


import javax.persistence.*;


@Entity
@Table(name="T_USER")
public class User {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id ;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String  lastName;

    @Column(name="email")
    private String email;

    // CONSTRUCTORS
    public User() {
    }

    public User(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // GETTER & SETTER
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}