package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// java 9 and later version use the javax.anotation-api-1.3.2.jar 
@Component
@Scope()
public class TrackCoach implements Coach{
	
	public TrackCoach() {}
	

	@Override
	public String getDailyWorkout() {
		return "TrackCoach => running for warm";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// add init method (after constructor method call)
	@PostConstruct
	public void initMethod() {
		System.out.println("init method call");
	}
	
	// add destroy method (before bean destroy )
	@PreDestroy
	public void destroyMethod() {
		System.out.println("destroy method call");
	}
}
