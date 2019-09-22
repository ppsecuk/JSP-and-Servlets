package main.com.sda.model;

import lombok.Data;

import javax.persistence.*;

@Entity
public @Data
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  //IDENTITY
    private int id;

    @Column(name = "userName")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "fullName")
    private String fullName;
}
