package com.springcourse.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {
	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");) {
			Coach theCoach = context.getBean("myCoach", Coach.class);
			System.out.println(theCoach.getDailyWorkout());
		}

	}

}
