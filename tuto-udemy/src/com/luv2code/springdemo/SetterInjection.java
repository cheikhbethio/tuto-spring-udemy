package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection {

	public static void main(String[] args) {
		//load  spring configuration file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCricketCoach", Coach.class);

		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// close context
		context.close();
	}

}
