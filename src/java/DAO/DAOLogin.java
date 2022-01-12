/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Admin;
import pojo.TokoBajuUtil;
import pojo.User;

/**
 *
 * @author Desmita Aprilia
 */
public class DAOLogin {
    public List<Admin> getByAdmin(String uName, String uPass){
        Transaction trans = null;
        Admin ad = new Admin();
        Session session = TokoBajuUtil.getSessionFactory().openSession();
        List<Admin> admin = new ArrayList();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from Admin where username=:uName AND password=:uPass");
            query.setString("uName", uName);
            query.setString("uPass", uPass);
            ad = (Admin) query.uniqueResult();
            admin = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return admin;
    }
    
    public List<User> getBy (String uName, String uPass){
        Transaction trans = null;
        User us = new User();
        Session session = TokoBajuUtil.getSessionFactory().openSession();
        List<User> user = new ArrayList();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from User where username=:uName AND password=:uPass");
            query.setString("uName", uName);
            query.setString("uPass", uPass);
            us = (User) query.uniqueResult();
            user = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return user;
    }
    public void add_user(User user){
        Transaction trans = null;
        Session session = TokoBajuUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            session.save(user);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
