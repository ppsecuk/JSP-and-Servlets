package main.com.sda.model;

import org.hibernate.Session;

public class UserDAOimpl implements UserDAO {
    static Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void createUser(String userName, String password, String fullName) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setFullName(fullName);
    }
    @Override
    public User getUser(String userName) {
        User aUser = (User) session.createQuery("FROM main.com.sda.model.User WHERE " +
                "userName = " + userName, User.class);
        return aUser;
    }
    @Override
    public void updateUser(String userName, String password, String fullName) {
        User aUser = (User) session.createQuery("FROM main.com.sda.model.User WHERE " +
                "userName = " + userName, User.class);
        aUser.setFullName(fullName);
        aUser.setPassword(password);
    }
    @Override
    public void deleteUser(String userName) {
        //FIXME: add delete operation
    }
}
