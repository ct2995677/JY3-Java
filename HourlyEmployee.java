package com.tuteedu.Lil_chet;

public class HourlyEmployee {

	 double salaryHour;
	    int hour;

	    public HourlyEmployee(String name,int mouth,double salaryHour,int hour){
	        super(name,mouth);
	        this.salaryHour = salaryHour;
	        this.hour = hour;
	    }

	    public double getSalary(int mouth) {
	        if(this.mouth == mouth){
	            if(hour<=160){
	                return salaryHour*hour+100;
	            }else{
	                return 160*salaryHour + (hour - 160)*1.5*salaryHour + 100;
	            }
	        }else{
	            if(hour<=160){
	                return salaryHour*hour;
	            }else{
	                return 160*salaryHour + (hour - 160)*1.5*salaryHour;
	            }
	        }
	    }


}
