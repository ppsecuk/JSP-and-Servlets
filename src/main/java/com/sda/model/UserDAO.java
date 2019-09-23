package main.java.com.sda.model;

import main.java.com.sda.model.User;

public interface UserDAO {
    // Here we want to design CRUD operations

    // C -> create a new user
    void createUser(String userName, String password, String fullName);

    // R -> read a user data
    User getUser(String userName);

    // U -> update a user date
    void updateUser(String userName, String password, String fullName);

    // D -> Delete a user
    void deleteUser(String userName);
}
