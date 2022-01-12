/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.hibernate.Session;
import pojo.Admin;
import pojo.TokoBajuUtil;

/**
 *
 * @author Desmita Aprilia
 */
public class DAOAdmin {
    public List<Admin> retrveAdmin(){
        List stud = new ArrayList();
        Admin stud1 = new Admin();
        Transaction trans = null;
        Session session = TokoBajuUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from Admin");
            stud = query.list();
            stud.add(stud1.getIdAdmin());
            stud.add(stud1.getUsername());
            stud.add(stud1.getPassword());
            
            trans.commit();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return stud;
    }
    
    public List<Admin> getbyId(String idU){
        Admin adm = new Admin();
        List<Admin> iAdm = new ArrayList();
        
        Transaction trans = null;
        Session session = TokoBajuUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from Admin where id_admin = :id");
            query.setString("id", idU);
            adm = (Admin) query.uniqueResult();
            iAdm = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return iAdm;
    }
    
}


    
