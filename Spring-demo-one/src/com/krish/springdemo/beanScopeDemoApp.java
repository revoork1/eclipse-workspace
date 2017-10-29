package com.krish.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach=context.getBean("myCoach", Coach.class);
		Coach alphaCoach=context.getBean("myCoach", Coach.class);
		boolean result = (theCoach==alphaCoach);
		System.out.println("Pointing to the same object:"+result);
		System.out.println("Memory location of theCoach:"+ theCoach);
		System.out.println("Memory location of alphaCoach:"+ alphaCoach);
		context.close();
	}

}
