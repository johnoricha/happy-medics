package com.codingchallenge.happymedics.user;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private String accountType;

    @Transient
    private Integer age;

    public User() {
    }

    public User(Long id, String name, String email, LocalDate dob, String accountType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.accountType = accountType;
    }

    public User(String name, String email, LocalDate dob, String accountType) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.accountType = accountType;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", accountType='" + accountType + '\'' +
                ", age=" + age +
                '}';
    }
}
