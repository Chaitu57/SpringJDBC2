package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.Adress;
import com.mindgate.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		
		System.out.println("ApplicationContext is Created");
		
		Adress adress=applicationContext.getBean("adress",Adress.class);
		adress.setAdressId(101);
		adress.setCity("kalyan");
		adress.setState("Mahareashtra");
		adress.setStreet("MG raod");
		System.out.println(adress);
		
		System.out.println("=".repeat(50));
		
		Employee employee=applicationContext.getBean("employee",Employee.class);
		System.out.println(employee);
		
		
		
	}
}
