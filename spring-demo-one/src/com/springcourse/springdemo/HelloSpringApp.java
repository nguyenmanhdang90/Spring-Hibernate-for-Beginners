package com.springcourse.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");) {
			Coach theCoach = context.getBean("myCoach", Coach.class);
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());
		}
	}
}
