package com.mindgate.pojo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("monthdetails")
@Scope("prototype")
public class MonthDetails {

	private int monthId;
	private LocalDate monthStartDate;
	private LocalDate monthEndDate;
	
	@Autowired
	private FinacialYearDetails finacialYearDetails;
	
	
	public MonthDetails() {
		// TODO Auto-generated constructor stub
	}


	public MonthDetails(int monthId, LocalDate monthStartDate, LocalDate monthEndDate,
			FinacialYearDetails finacialYearDetails) {
		super();
		this.monthId = monthId;
		this.monthStartDate = monthStartDate;
		this.monthEndDate = monthEndDate;
		this.finacialYearDetails = finacialYearDetails;
	}


	public int getMonthId() {
		return monthId;
	}


	public void setMonthId(int monthId) {
		this.monthId = monthId;
	}


	public LocalDate getMonthStartDate() {
		return monthStartDate;
	}


	public void setMonthStartDate(LocalDate monthStartDate) {
		this.monthStartDate = monthStartDate;
	}


	public LocalDate getMonthEndDate() {
		return monthEndDate;
	}


	public void setMonthEndDate(LocalDate monthEndDate) {
		this.monthEndDate = monthEndDate;
	}


	public FinacialYearDetails getFinacialYearDetails() {
		return finacialYearDetails;
	}


	public void setFinacialYearDetails(FinacialYearDetails finacialYearDetails) {
		this.finacialYearDetails = finacialYearDetails;
	}


	@Override
	public String toString() {
		return "MonthDetails [monthId=" + monthId + ", monthStartDate=" + monthStartDate + ", monthEndDate="
				+ monthEndDate + ", finacialYearDetails=" + finacialYearDetails + "]";
	}
	
	

}
