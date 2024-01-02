package com.example.hibernate;

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
        
        
        SessionFactory fac = cfg.buildSessionFactory();
        Session se=fac.openSession();
        Transaction tr=se.beginTransaction();
        
        Student st=new Student(11, "palalvi", 99);
        Student st2=new Student(12, "sanithi", 59);
        Student st3=new Student(13, "gratri", 34);
        se.save(st);
        se.save(st2);
        se.save(st3);
        tr.commit();
        
        System.out.println("creatted table and inserted data permanently.");
    }
}
