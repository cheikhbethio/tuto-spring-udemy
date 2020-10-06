package com.luv2code.springdemo;


import org.springframework.stereotype.Component;

// java 9 and later version use the javax.anotation-api-1.3.2.jar 
@Component
public class TrackCoach implements Coach{
	
	public TrackCoach() {}
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	

	@Override
	public String getDailyWorkout() {
		return "TrackCoach => running for warm";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
}
