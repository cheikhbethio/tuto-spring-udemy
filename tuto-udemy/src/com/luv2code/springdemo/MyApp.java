package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		//load  spring configuration file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach0 = context.getBean("trackCoach", Coach.class);
		Coach theCoach1 = context.getBean("trackCoach", Coach.class);

		Boolean isSameReference = theCoach0 == theCoach1;
		System.out.println("is the same reference ? " + isSameReference);	
		System.out.println("what about the theCoach0 ? " + theCoach0);	
		System.out.println("what about the theCoach1 ? " + theCoach1);
		/*
		 * in case we set in the applicationContext.xml file 
		 * the scope to singleton or not set it (the default value)
		 * the reference not be equal=> isSameReference == true
		 * otherwise it will be true
		 * */
		
		
		
		// close context
		context.close();
	}

}
