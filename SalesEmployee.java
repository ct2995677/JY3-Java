package com.tuteedu.Lil_chet;

public class SalesEmployee {

	double sales;
    double rate;
	private int mouth;

    public SalesEmployee(String name,int mouth,double sales,double rate){
        super();
        this.sales = sales;
        this.rate = rate;
    }

    public double getSalary(int mouth) {
        if(this.mouth == mouth){
            return sales * rate + 100;
        }else{
            return sales * rate + 100;
        }
    }

}
