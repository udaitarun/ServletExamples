package com.maven.demo.Maven.App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.event.spi.SaveOrUpdateEvent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        
        Configuration configuration = new Configuration();
        configuration.configure("com/maven/demo/Maven/App/hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        
     
        System.out.println(factory);
        
        Student student1 = new Student(100, "mahesh");
        
//        Student student2 = new Student(101, "vamshi");
//        Student student3 = new Student(102, "udai");
//        Student student4 = new Student(103, "karthik");
        
        
        System.out.println(student1);
        
        
        
        Session session = factory.openSession();
        Transaction tr = session.beginTransaction();
        
        session.save(student1);
        
//        session.save(student2);
//        session.save(student3);
//        session.save(student4);
        
        
        
        tr.commit();
        
        session.close();
       
        
    }
    
    
}
