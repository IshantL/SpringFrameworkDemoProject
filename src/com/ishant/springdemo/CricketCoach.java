package com.ishant.springdemo;

public class CricketCoach implements Coach {

	FortuneService fortuneService;
	private String email;
	private String team;
	
	//create a new argument constructor
	public CricketCoach() {
		System.out.println("Cricket Coach :Inside no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach :Inside the setter method");
		this.fortuneService = fortuneService;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Cricket Coach :Inside the setter method of email");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach :Inside the setter method of team");
		this.team = team;
	}

	public String getDailyWorkout() {
		return "Prctise fast bowling";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
