package com.luv2code.springdemo;

public class BaseBallCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "BaseBallCoach => Spend 30 min in wod";
	}

}
