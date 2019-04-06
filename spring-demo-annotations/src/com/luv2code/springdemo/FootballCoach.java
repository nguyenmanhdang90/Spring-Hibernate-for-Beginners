package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Autowired
	@Qualifier("myOwnFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "FootballCoach: getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
