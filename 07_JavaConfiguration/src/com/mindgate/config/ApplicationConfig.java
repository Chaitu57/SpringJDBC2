package com.mindgate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mindgate.pojo.Adress;
import com.mindgate.pojo.Employee;

@Configuration
@ComponentScan("com.mindgate.pojo")
public class ApplicationConfig {
//	@Bean
//	public Adress adress() {
//		System.out.println("in adress() of ApplicationConfig");
//		return new Adress();
//	}
//
//	@Bean
//	public Employee employee() {
//		System.out.println("in employee() of ApplicationConfig");
//		Adress adress=new  Adress();
//		Employee employee=new Employee();
//		employee.setHomeAdress(adress);
//		
//		return employee;
//	}

}
