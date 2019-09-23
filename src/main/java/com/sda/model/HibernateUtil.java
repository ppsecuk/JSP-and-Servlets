package main.java.com.sda.model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//CREATE SESSIONFACTORY
public class HibernateUtil {
    
    private static SessionFactory sessionFactory;
    
    private static SessionFactory createSessionFactory() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        return sessionFactory;
    }
    
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null)
            sessionFactory = createSessionFactory();
        
        return sessionFactory;
    }
}
