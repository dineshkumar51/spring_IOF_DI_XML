package com.dinesh.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast Bpwling for 15 minutes";
	}
	
	public String getDetails() {
		return emailAddress+ " " + team;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
