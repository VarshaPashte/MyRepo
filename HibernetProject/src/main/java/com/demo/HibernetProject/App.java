package com.demo.HibernetProject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	static InputStreamReader r;  
    static BufferedReader brr;  
    static String name1;
    static String city1;
    static String course1;
    static String duration1;
    
    public static void main( String[] args ) throws Exception
    {
    	r= new InputStreamReader(System.in);
    	brr=new BufferedReader(r);
        System.out.println( "Project staretd" );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        Session session =factory.getCurrentSession();
        System.out.println(factory.isClosed());
        
        
        /*System.out.println("Enter name:");
        name1=brr.readLine();
        System.out.println("Enter city");
        city1=brr.readLine();
        /*System.out.println("Enter course:");
        course1=brr.readLine();
        System.out.println("Enter duration:");
        duration1=brr.readLine();
      
       Certificate c=new Certificate("java","2 months");
       Certificate cf=new Certificate("python","4months");
       StudentEntity st1=new StudentEntity("dipali",cf);
       StudentEntity st=new StudentEntity();
       st.setName(name1);
       st.setCerti(c);
       
        System.out.println(st);
        session.beginTransaction();
        session.save(st);
        session.save(st1);*/
        //Reading image
        
        FileInputStream fis=new FileInputStream("src/main/java/logo.png");
        byte [] data= new byte[fis.available()];
        fis.read(data);
        
        //Certificate c=new Certificate("java","2 months");
        
        Address add=new Address();
        add.setStreet("sangharsh nagar");
        add.setImage(data);
        add.setCity("Mumbai");
        add.setOpen(true);
        add.setHouseNo(6.1);
        add.setAdd_date(new Date());
        //StudentEntity st1=new StudentEntity("dipali","Mumbai",c);
        session.beginTransaction();
        session.save(add);
        
        session.getTransaction().commit();
        session.close();
    }
}
