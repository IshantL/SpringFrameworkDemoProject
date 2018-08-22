package com.ishant.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run a hard 5k";
	}

	public String getDailyFortune() {
		return "Just do it " + fortuneService.getFortune();
	}

	//add an init method
	public void doMyStartupStuff(){
		System.out.println("TrackCoach:inside methodStartupStuff");
	}
	//add a destroy method
	public void doMyCleanupStuff(){
		System.out.println("TrackCoach:inside methodDestroyStuff");
	}
}
