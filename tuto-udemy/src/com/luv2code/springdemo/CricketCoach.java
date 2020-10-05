package com.luv2code.springdemo;

public class CricketCoach implements Coach{
	public CricketCoach() {
		System.out.println("CricketCoach: inside constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach: inside serter metho");
	}

	public FortuneService fortuneService;
		
	@Override
	public String getDailyWorkout() {
		return "CricketCoach => Spend 30 min in wod";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
