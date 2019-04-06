package com.springcourse.springdemo;

public class CricketCoach implements Coach {

	private String emailAddress;
	private String team;


	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("Cricket Coach: no arg contructor");
	}

	@Override
	public String getDailyWorkout() {
		return "practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
