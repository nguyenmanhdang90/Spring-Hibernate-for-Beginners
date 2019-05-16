package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			/*
			 * Student tempStudent = new Student("Dang", "Nguyen", "dang@dang.com");
			 * session.beginTransaction(); session.save(tempStudent);
			 * session.getTransaction().commit();
			 */

			session.beginTransaction();
			Student studentId1 = session.get(Student.class, 1);
			studentId1.setEmail("updated@email.com");
			session.update(studentId1);
			session.getTransaction().commit();

		} catch (Exception e) {

		} finally {
			factory.close();
		}


	}

}
