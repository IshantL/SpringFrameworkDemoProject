package com.ishant.springdemo;


public class BaseballCoach implements Coach {

	//define a private field for the dependency
	 private FortuneService fortuneService;
	 
	 //define a constructor for dependency Injection
	 public BaseballCoach(FortuneService theFortuneService){
		 fortuneService=theFortuneService;
	 }
	
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	public String getDailyFortune() {
		// use my fortune service to get fortune
		return fortuneService.getFortune();
	}

}