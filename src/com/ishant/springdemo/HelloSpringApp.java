package com.ishant.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuaration fie
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive the bean
		//this bean now has a dependency on fortune service
		Coach theCoach=context.getBean("myCoach",Coach.class);
		//call method
		
		System.out.println(theCoach.getDailyWorkout());
		//lets call new methods for fortune
		System.out.println(theCoach.getDailyFortune());
		//close context
		context.close();
	}

}
