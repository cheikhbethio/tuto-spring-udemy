package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luv2code.springdemo")
public class SportgConf {
	// define beans and injection dependency
	@Bean 
	public FortuneService sadFortuuneServive() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach tracCoach() {
		return new TrackCoach(sadFortuuneServive());
	}

}
