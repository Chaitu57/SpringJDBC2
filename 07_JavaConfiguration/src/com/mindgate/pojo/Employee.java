package com.mindgate.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employee")
@Scope ("prototype")
 public class Employee {

	private int employeeId;
	private String name;
	private double salary;
    
	@Autowired
	private Adress homeAdress;
	
	public Employee() {
		System.out.println("default constructor  employee called");
	}

	public Employee(int employeeId, String name, double salary, Adress homeAdress) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.homeAdress = homeAdress;
		System.out.println("overlaoded constructor of employee called");
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
		System.out.println(" set  employeeId"+employeeId);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(" set name" +name);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		System.out.println(" set salary"+ salary);
	}

	public Adress getHomeAdress() {
		return homeAdress;
	}

	public void setHomeAdress(Adress homeAdress) {
		this.homeAdress = homeAdress;
		System.out.println(" set adreess" +homeAdress);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", homeAdress="
				+ homeAdress + "]";
	}
	
}
