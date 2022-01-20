package com.demo.HibernetProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Project staretd" );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        Session session =factory.getCurrentSession();
        System.out.println(factory.isClosed());
		
		Certificate c=new Certificate("java","2 months");
	       Certificate cf=new Certificate("python","4months");
	       StudentEntity st1=new StudentEntity("dipali","mumbai",cf);
	       StudentEntity st=new StudentEntity();
	       st.setName("Ashwini");
	       
	   st.setCerti(c);
	       
	        System.out.println(st);
	        session.beginTransaction();
	        session.save(st);
	        session.save(st1);
	}

}
