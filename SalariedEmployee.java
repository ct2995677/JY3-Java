package com.tuteedu.Lil_chet;

public class SalariedEmployee {

	double salary;
	private int mouth;

    public SalariedEmployee(String name,int mouth,int salary){
        super();
        this.salary = salary;
    }

    public double getSalary(int mouth){
        if(this.mouth == mouth){
            return salary+100;
        }else{
            return salary;
        }
    }

}
