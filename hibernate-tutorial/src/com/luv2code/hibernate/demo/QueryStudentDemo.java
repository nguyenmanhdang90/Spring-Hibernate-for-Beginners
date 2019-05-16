package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();

			List<Student> students = session.createQuery("from Student").list();
			students.forEach(System.out::println);

			System.out.println("firstName Dang");
			session.createQuery("from Student s where s.firstName='Dang'").list().forEach(System.out::println);

			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			factory.close();
		}


	}

}
