package main.com.sda.model;

public class UserDAOimpl implements UserDAO {
    @Override
    public void createUser(String userName, String password, String fullName) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setFullName(fullName);
    }
    @Override
    public User getUser(String userName) {
        return null;
    }
    @Override
    public void updateUser(String password, String fullName) {
    }
    @Override
    public void deleteUser(String userName) {
    }
}
