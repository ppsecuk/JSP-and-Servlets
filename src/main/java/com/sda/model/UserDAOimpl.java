package main.java.com.sda.model;

import main.java.com.sda.model.UserDAO;
import org.hibernate.Session;

public class UserDAOimpl implements UserDAO {
    static Session session = main.java.com.sda.model.HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void createUser(String userName, String password, String fullName) {
        User user = new User();
    }
    @Override
    public User getUser(String userName) {
        User aUser = (User) session.createQuery("FROM User WHERE " +
                "userName = " + userName, User.class);
        return aUser;
    }
    @Override
    public void updateUser(String userName, String password, String fullName) {
        User aUser = (User) session.createQuery("FROM User WHERE  userName = " + userName, User.class);
       
    }
    @Override
    public void deleteUser(String userName) {
        //FIXME: add delete operation
    }
}
