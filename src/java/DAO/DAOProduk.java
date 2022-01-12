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
import pojo.Produk;
import pojo.TokoBajuUtil;


/**
 *
 * @author Desmita Aprilia
 */
public class DAOProduk {
    public List<Produk> retrveProduk(){
        List stud = new ArrayList();
        Produk stud1 = new Produk();
        Transaction trans = null;
        Session session = TokoBajuUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from Produk");
            stud = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return stud;
    }
    
    public List<Produk> getbyID(String idP) {
        Produk pdk = new Produk();
        List<Produk> iPdk = new ArrayList();
        
        Transaction trans = null;
        Session session = TokoBajuUtil.getSessionFactory().openSession();
        
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from Produk where id_produk = :id");
            query.setString("id", idP);
            pdk = (Produk) query.uniqueResult();
            iPdk = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return iPdk;
    }
    
    public void deleteProduk(Integer idP){
        Transaction trans = null;
        Session session = TokoBajuUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Produk pdk = (Produk) session.load(Produk.class, new Integer(idP));
            session.delete(pdk);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void editProduk(Produk pdk){
        Transaction trans = null;
        Session session = TokoBajuUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            session.update(pdk);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void add_produk(Produk pdk){
        Transaction trans = null;
        Session session = TokoBajuUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            session.save(pdk);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
