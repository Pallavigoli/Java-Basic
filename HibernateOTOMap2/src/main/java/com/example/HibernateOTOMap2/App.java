package com.example.HibernateOTOMap2;

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
       
       SessionFactory fac =cfg.buildSessionFactory();
       Session se=fac.openSession();
       
       Transaction tr=se.beginTransaction();
       
       //creation of obj
       Bike2 b1=new Bike2();
       Bike2 b2=new Bike2();
       Bike2 b3 =new Bike2();
       
       //creation of obj with para 
       Person1 p1=new Person1(11, "pallavi", 29, b3);
       Person1 p2=new Person1(12, "yasvathi", 29, b1);
       Person1 p3=new Person1(13, "yakundha", 29, b2);
       
       //setting values to ref of bike 1
       b1.setB_engine(1234);
       b1.setB_brand("hero");
       b1.setB_cost(125000);
       b1.setP(p3);
       
       //setting values to ref of bike 2
       b2.setB_engine(1235);
       b2.setB_brand("honda");
       b2.setB_cost(145000);
       b2.setP(p2);
       
       //setting values to ref of bike 3
       b3.setB_engine(1236);
       b3.setB_brand("KTM");
       b3.setB_cost(195000);
       b3.setP(p1);
       
       se.save(p1);
       se.save(p2);
       se.save(p3);
       se.save(b1);
       se.save(b2);
       se.save(b3);
       
       tr.commit();
       
       System.out.println("created objs and mapped to one to one");
    }
}
