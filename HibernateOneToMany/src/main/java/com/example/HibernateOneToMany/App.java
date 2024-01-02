package com.example.HibernateOneToMany;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	//configurating the hibernate
        Configuration cfg=new Configuration();
        cfg.configure();
        
        
        //bulding the sessionFac
        SessionFactory fac=cfg.buildSessionFactory();
        
        //Session opened
        Session se=fac.openSession();
        
        //Transcation started
        Transaction t=se.beginTransaction();
        
        //technology obj
        Technology t1=new Technology();//123,"java"
        Technology t2=new Technology();//124, "HTML"
        Technology t3=new Technology();//125, "CSS"
        Technology t4=new Technology();//126, "SQL"
        
        //grouping 
        List<Technology> list1=new ArrayList<Technology>();
        list1.add(t1);
        list1.add(t2);
        
        List<Technology> list2=new ArrayList<Technology>();
        //list2.add(t1);
        // list2.add(t2);
        list2.add(t3);
        // list2.add(t4);
        
        List<Technology> list3=new ArrayList<Technology>();
        //list3.add(t1);
        list3.add(t4);
        
        //sofwareEng obj
        SoftwareEng s1=new SoftwareEng(1,"sumit",29,list1);
        SoftwareEng s2=new SoftwareEng(2,"sourav",30,list2);
        SoftwareEng s3=new SoftwareEng(3,"sachin",28,list3);
        
        //setting technology obj values
        t1.setT_id(123);
        t1.setT_name("java");
        t1.setS(s3);
        t1.setS(s1);
        t1.setS(s2);
        
        t2.setT_id(124);
        t2.setT_name("html");
        t2.setS(s1);
        t2.setS(s2);
        
        t3.setT_id(125);
        t3.setT_name("css");
        t3.setS(s2);
        
        t4.setT_id(126);
        t4.setT_name("sql");
        t4.setS(s2);
        t4.setS(s3);
        
        //saving software
        se.save(s1);
        se.save(s2);
        se.save(s3);
        
        //saving techno
        se.save(t1);
        se.save(t2);
        se.save(t3);
        se.save(t4);
        
        t.commit();
    }
}
