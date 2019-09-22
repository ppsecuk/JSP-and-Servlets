package main.com.sda;

import main.com.sda.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainApp {
    static User admin = new User("admin", "1234", "administrator");

    public static void main(String[] args) {
        Transaction transaction = null;
        // NOTE: injecting configuration XML into our appliation so the app knows where to look
        // for database/Hibernate configurations
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        try (Session session = configuration.buildSessionFactory().openSession()) {
            List<User> users = session.createQuery("FROM main.com.sda.model.User", User.class).list();
            // start a transaction
            transaction = session.beginTransaction();
            // save the student objects
            session.save(admin);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        try (Session session = configuration.buildSessionFactory().openSession()) {
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
