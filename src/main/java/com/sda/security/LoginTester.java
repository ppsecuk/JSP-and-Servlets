package main.java.com.sda.security;

import main.java.com.sda.model.HibernateUtil;
import main.java.com.sda.model.User;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoginTester extends HttpServlet {
    List<User> usersList = new ArrayList<>();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userInput");
        String password = req.getParameter("passInput");
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()){
            String query = "SELECT * FROM users WHERE userName = " + userName + " AND password = " +
                     password + ";";
            usersList = (List<User>) session.createQuery(query).getResultList();
            if(usersList != null){
                System.out.println("Logged in successfully");
                return;
            }
            System.out.println("User not found");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
