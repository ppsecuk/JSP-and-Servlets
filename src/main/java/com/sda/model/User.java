package main.java.com.sda.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //AUTO --> refer to documentation
    @Column(name ="id")
    private int id;
    @Column(name = "userName")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "fullName")
    private String fullName;
    public User(String admin, String password, String administrator) {
        this.fullName = administrator;
        this.userName = admin;
        this.password = password;
    }
    public User() {
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", userName='" + userName + '\'' + ", password='" + password + '\''
               + ", fullName='" + fullName + '\'' + '}';
    }
}
