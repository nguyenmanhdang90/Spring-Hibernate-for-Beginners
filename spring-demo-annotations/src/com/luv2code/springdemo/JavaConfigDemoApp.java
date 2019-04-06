package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);) {
			Coach theCoach = context.getBean("tennisCoach", Coach.class);
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());
			Coach theFootBallCoach = context.getBean("footballCoach", Coach.class);
			System.out.println(theFootBallCoach.getDailyWorkout());
			System.out.println(theFootBallCoach.getDailyFortune());
		}

	}

}
