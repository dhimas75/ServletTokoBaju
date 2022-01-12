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
import pojo.TokoBajuUtil;
import pojo.User;

/**
 *
 * @author Desmita Aprilia
 */
public class DAOUser {
    public List<User> retrveUser(){
        List stud = new ArrayList();
        User stud1 = new User();
        Transaction trans = null;
        Session session = TokoBajuUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from User");
            stud = query.list();
            stud.add(stud1.getIdUser());
            stud.add(stud1.getUsername());
            stud.add(stud1.getPassword());
            stud.add(stud1.getJenisKelamin());
            stud.add(stud1.getNoTelp());
            stud.add(stud1.getAlamat());
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return stud;
    }
    
    public List<User> getbyId(String idU){
        User usr = new User();
        List<User> iUsr = new ArrayList();
        
        Transaction trans = null;
        Session session = TokoBajuUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from User where id_user = :id");
            query.setString("id", idU);
            usr = (User) query.uniqueResult();
            iUsr = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return iUsr;
    }
    
        public void editUser(User usr){
        Transaction trans = null;
        Session session = TokoBajuUtil.getSessionFactory().openSession();
        
        try{
            trans = session.beginTransaction();
            session.update(usr);
            trans.commit();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
