package com.demo.HibernetProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		//get data
		StudentEntity stu=(StudentEntity) session.get(StudentEntity.class,1);
		System.out.println(stu.getCerti());
		System.out.println(stu.getName());
		//System.out.println(stu.getAddrs());
		//load data
		Address stu1=(Address) session.load(Address.class,1);
		System.out.println(stu1.getStreet());
		session.close();
	}

}
