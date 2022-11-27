package com.dinesh.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5Km";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void startUp()
	{
		System.out.println("TrackCoach : inside startUp method");
	}
	

	public void cleanUp()
	{
		System.out.println("TrackCoach : inside cleanUp method");
	}

}
