package com.example.HibernateOTOMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration  cfg=new Configuration();
        cfg.configure();
        SessionFactory fac = cfg.buildSessionFactory();
        Session se=fac.openSession();
        Transaction tr=se.beginTransaction();
        
        Bike b1=new Bike(2345, "pulsar", 987000);
        Bike b2=new Bike(98765, "splender", 67700);
        Bike b3=new Bike(98878, "hero", 87000);
        
        //passing ref of Bike to map person to bike
        Person p1=new Person(1, "pallavi", 21,b3);
        Person p2=new Person(2, "kamesh", 45,b1);
        Person p3=new Person(3, "aishwarya", 31,b2);
        
        se.save(p1);
        se.save(p2);
        se.save(p3);
        
        se.save(b1);
        se.save(b2);
        se.save(b3);
        
        tr.commit();
        System.out.println("created the object");
        
    }
}
