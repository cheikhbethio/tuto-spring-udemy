package com.luv2code.springdemo;

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
	public void initMethod() {
		System.out.println("init method call");
	}
	
	// add destroy method (before bean destroy )
	public void destroyMethod() {
		System.out.println("destroy method call");
	}
}
