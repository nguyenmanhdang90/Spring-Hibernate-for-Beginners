package com.springcourse.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach " + fortuneService.getFortune();
	}

	public void doMyStartupStuff() {
		System.out.println("trackCoach: inside method doMyStartupStuff");
	}

	public void doMyDestroyStuff() {
		System.out.println("trackCoach: inside method doMyDestroyStuff yo yo nigga");
	}

}
