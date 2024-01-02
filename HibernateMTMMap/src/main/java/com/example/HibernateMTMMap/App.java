package com.example.HibernateMTMMap;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure();
        
        SessionFactory fac=cfg.buildSessionFactory();
        Session se=fac.openSession();
        Transaction tr=se.beginTransaction();
        
        //for books related requirements
        Author a1=new Author();
        Author a2=new Author();
        Author a3=new Author();
        
        List<Author> l1=new ArrayList<Author>();
        l1.add(a1);
        l1.add(a3);
        
        List<Author> l2=new ArrayList<Author>();
        l2.add(a2);
        l2.add(a1);
        
        List<Author> l3=new ArrayList<Author>();
        l3.add(a2);
        l3.add(a3);
        
        Books b1=new Books(1, "javaEd1", "BackEndDeveloper", l1);
        Books b2=new Books(2, "SqlEd1", "DataBaseDeveloper", l2);
        Books b3=new Books(3, "HtmlEd1", "FrontEndDeveloper", l3);
        
        //requriements for Author
        List<Books> la1=new ArrayList<Books>();
        la1.add(b2);
        
        List<Books> la2=new ArrayList<Books>();
        la2.add(b2);
        la2.add(b3);
        
        List<Books> la3=new ArrayList<Books>();
        la3.add(b3);
        la3.add(b1);
        
        a1.setId(90);
        a1.setName("edison");
        a1.setGender('M');
        a1.setB(la3);
        
        a2.setId(80);
        a2.setName("thomson");
        a2.setGender('M');
        a2.setB(la2);
        
        a3.setId(70);
        a3.setName("Jully");
        a3.setGender('F');
        a3.setB(la1);
        
        //saving
        se.save(b1);
        se.save(b2);
        se.save(b3);
        
        se.save(a1);
        se.save(a2);
        se.save(a3);
        
        
        tr.commit();
        
        System.out.println("created many to many mapping");
        
        
    }
}
