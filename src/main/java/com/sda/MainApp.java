package main.java.com.sda;

import main.java.com.sda.model.HibernateUtil;
import main.java.com.sda.model.User;
import org.hibernate.Session;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class MainApp {
    public static void main(String[] args) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            System.out.println("Session opened: OK");
            session.beginTransaction();
            System.out.println("Transaction begin: OK");
            List<User> list = (ArrayList<User>) session.createQuery(" from User").list();
            list.forEach(user -> {System.out.println(user.toString() + "\n");});
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("unable to create a session : ERROR");
        }
        finally {
            System.out.println("finally blocked is reached: OK");
            if (session != null) {
                session.close();
            }
        }
    }
}
