package com.luv2code.springdemo;

public class TrackCoach implements Coach{

	public FortuneService fortuneService;
	
	public TrackCoach() {}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "TrackCoach => running for warm";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
