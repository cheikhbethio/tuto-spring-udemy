package com.luv2code.springdemo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// java 9 and later version use the javax.anotation-api-1.3.2.jar 
@Component
public class TrackCoach implements Coach{
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public TrackCoach() {}
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}
	
	public String getTeam() {
		return team;
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
