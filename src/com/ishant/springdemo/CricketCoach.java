package com.ishant.springdemo;

public class CricketCoach implements Coach {

	FortuneService fortuneService;
	
	//create a new argument constructor
	public CricketCoach() {
		System.out.println("Cricket Coach :Inside no-arg constructor");
	}

	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach :Inside the setter method");
		this.fortuneService = fortuneService;
	}



	public String getDailyWorkout() {
		return "Prctise fast bowling";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
