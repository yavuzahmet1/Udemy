package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
	
		//ClassPathXmlApplicationContext context=
			//	new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AnnotationConfigApplicationContext context2=new AnnotationConfigApplicationContext(IocConfig.class);
		context2.refresh();
		
		ICustomerDal customerDal=context2.getBean("database",ICustomerDal.class);
		
		customerDal.add();


	}

}
