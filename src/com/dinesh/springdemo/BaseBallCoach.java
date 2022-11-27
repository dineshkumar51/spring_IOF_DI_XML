package com.dinesh.springdemo;

public class BaseBallCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout()
	{
		return "spend 30 minutes on batting practice";
	}

	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}
