package com.mindgate.pojo;

import java.time.LocalDate;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("finacialyeardetails")
@Scope("prototype")
public class FinacialYearDetails {
 private  int yearId;
 private LocalDate yearStartDate;
 private LocalDate yearEndDate;
 
 public FinacialYearDetails() {
	// TODO Auto-generated constructor stub
}

public FinacialYearDetails(int yearId, LocalDate yearStartDate, LocalDate yearEndDate) {
	super();
	this.yearId = yearId;
	this.yearStartDate = yearStartDate;
	this.yearEndDate = yearEndDate;
}

public int getYearId() {
	return yearId;
}

public void setYearId(int yearId) {
	this.yearId = yearId;
}

public LocalDate getYearStartDate() {
	return yearStartDate;
}

public void setYearStartDate(LocalDate yearStartDate) {
	this.yearStartDate = yearStartDate;
}

public LocalDate getYearEndDate() {
	return yearEndDate;
}

public void setYearEndDate(LocalDate yearEndDate) {
	this.yearEndDate = yearEndDate;
}

@Override
public String toString() {
	return "FinacialYearDetails [yearId=" + yearId + ", yearStartDate=" + yearStartDate + ", yearEndDate=" + yearEndDate
			+ "]";
}
 
 
	
	
}
