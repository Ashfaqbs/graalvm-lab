package com.example.demo.model;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users", schema = "public")
public class UserEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "gender")
    private String gender;

    protected UserEntity() {
        // required by JPA
    }

    public Long getId() {
        return id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }
}
