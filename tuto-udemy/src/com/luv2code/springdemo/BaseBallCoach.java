package com.luv2code.springdemo;

public class BaseBallCoach implements Coach{
	public FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	
	@Override
	public String getDailyWorkout() {
		return "BaseBallCoach => Spend 30 min in wod";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
