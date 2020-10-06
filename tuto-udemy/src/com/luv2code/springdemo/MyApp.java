package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MyApp {

	public static void main(String[] args) {
		//load  spring configuration file
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(SportgConf.class);
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		System.out.println("MyApp " + theCoach.getDailyWorkout());
		
		// close context
		context.close();
	}

}
