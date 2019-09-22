package main.com.sda.model;

import lombok.Data;

public @Data
class User {
    private int id;
    private String userName;
    private String password;
    private String fullName;
}
