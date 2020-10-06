package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		//load  spring configuration file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		System.out.println("from the main application " + theCoach.getDailyWorkout());
		System.out.println("from the main application " + theCoach.getDailyFortune());
				
		// close context
		context.close();
	}

}
