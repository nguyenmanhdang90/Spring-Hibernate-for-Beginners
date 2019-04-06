package com.springcourse.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanScope-applicationContext.xml");) {
			Coach theCoach = context.getBean("myCoach", Coach.class);
			Coach alphaCoach = context.getBean("myCoach", Coach.class);
			System.out.println(theCoach == alphaCoach);
			System.out.println(theCoach);
			System.out.println(alphaCoach);
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());
		}

	}

}
