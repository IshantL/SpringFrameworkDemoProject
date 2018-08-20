package com.ishant.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuaration fie
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive the bean
		
		Coach theCoach=context.getBean("myCoach",Coach.class);
		//call method
		
		System.out.println(theCoach.getDailyWorkout());
		//close context
		context.close();
	}

}
