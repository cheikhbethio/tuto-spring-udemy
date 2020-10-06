package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MyApp {

	public static void main(String[] args) {
		//load  spring configuration file
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(SportgConf.class);
		
		// retrieve bean from spring container
		TrackCoach theCoach = context.getBean("trackCoach", TrackCoach.class);
		System.out.println("MyApp " + theCoach.getDailyWorkout());

		System.out.println("email " + theCoach.getEmail());
		System.out.println("team " + theCoach.getTeam());
		
		// close context
		context.close();
	}

}
