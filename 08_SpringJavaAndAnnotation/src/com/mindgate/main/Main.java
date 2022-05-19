package com.mindgate.main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.mainconfig.mainconfig;
import com.mindgate.pojo.FinacialYearDetails;
import com.mindgate.pojo.MonthDetails;

public class Main {
public static void main(String[] args) {
	

    ApplicationContext applicationContext=new AnnotationConfigApplicationContext(mainconfig.class);
       FinacialYearDetails finacialYearDetails=applicationContext.getBean("finacialyeardetails",FinacialYearDetails.class);
	          System.out.println(finacialYearDetails);
       
       
       
       
       MonthDetails monthDetails=applicationContext.getBean("monthdetails",MonthDetails.class);
	
	    monthDetails.setMonthId(03);
	    monthDetails.setMonthEndDate(LocalDate.of(2022,05,30));
	    monthDetails.setMonthStartDate(LocalDate.of(2022,05,01));
	    
	    
	    System.out.println(monthDetails);
	    
	  
	  
}

}