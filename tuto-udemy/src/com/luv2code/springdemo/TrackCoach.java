package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
	@Autowired
	private FortuneService fortuneService;
	
	// it is possible to do this injection with any method 
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	

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
