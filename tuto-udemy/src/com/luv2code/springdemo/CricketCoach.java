package com.luv2code.springdemo;

public class CricketCoach implements Coach{

	private String email;
	private String team;
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach: inside serter metho");
	}

		
	@Override
	public String getDailyWorkout() {
		return "CricketCoach => Spend 30 min in wod";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		System.out.println("setEmail address");
		this.email = email;
	}
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		System.out.println("set team");
		this.team = team;
	}
}
