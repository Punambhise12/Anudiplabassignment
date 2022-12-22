package com.example;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println( "Project Started!" );
         Configuration cfg=new Configuration().configure().addAnnotatedClass(Teacher.class);
         Configuration cfg1=new Configuration().configure().addAnnotatedClass(Courses.class);
         SessionFactory sf=cfg.buildSessionFactory();
         Session s = sf.openSession();
         Transaction T = s.beginTransaction();
         
         Teacher T1 = new Teacher();
         T1.setT_id(102);
         T1.setName("Anuradha");
         T1.setDepartment("CSC");
        
         Courses c1 = new Courses();
         Courses c2 = new Courses();
         Courses c3 = new Courses();
         c1.setC_id(204);
         c1.setC_name("python Trainer");
         c2.setC_id(202);
         c2.setC_name("java Programming");
         c3.setC_id(203);
         c3.setC_name("Angular Programming");
         
         List<Courses> course = new ArrayList();
         course.add(c1);
         course.add(c2);
         course.add(c3);
         
         T1.setCourses(course);
         s.persist(T1);
         T.commit();
         s.close();
         
    }
}