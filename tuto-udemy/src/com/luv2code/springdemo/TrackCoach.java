package com.luv2code.springdemo;

public class TrackCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "TrackCoach => running for warm";
	}

}
