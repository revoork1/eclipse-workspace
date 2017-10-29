package com.krish.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BaseballCoach tC = new BaseballCoach();
//		System.out.println(tC.getDailyWorkout());
		FortuneService fortuneService=new HappyFortuneService();
		Coach theCoach = new BaseballCoach(fortuneService);
		System.out.println(theCoach.getDailyWorkout());

	}

}
