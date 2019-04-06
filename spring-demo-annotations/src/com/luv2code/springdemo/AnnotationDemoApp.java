package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");) {
			Coach theCoach = context.getBean("tennisCoach", Coach.class);
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());
			Coach theFootBallCoach = context.getBean("footballCoach", Coach.class);
			System.out.println(theFootBallCoach.getDailyWorkout());
			System.out.println(theFootBallCoach.getDailyFortune());
		}

	}

}
