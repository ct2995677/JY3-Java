package com.tuteedu.Lil_chet;

public class ColoText {

	public class Test {
	    public void main(String[] args) {
	        ColaEmployee[] c = {new SalariedEmployee("����", 1, 3000),
	                            new HourlyEmployee("����", 2, 20,180),
	                            new SalesEmployee("����",3,300000,0.01)};

	        for(int i =0;i<c.length;i++ ){
	            ((Object) new Company()).getSalary(c[i], 3);
	        }
	    }
	}
	
}
