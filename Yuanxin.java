package com.neuedu;

public class Yuanxin {
	double x;
	double y;
	int r;
	public void circlexin()
	{
		System.out.println("圆的圆心为:");
	}
	public void banjing()
	{
		System.out.println("圆的半径为:");
	}
	
	public static void main(String[] args) {
		Yuanxin y1 = new Yuanxin();
		y1.x = 25.4;
		y1.y = 17.9;
		y1.r = 13;
		
		y1.circlexin();
		System.out.println("x:"+y1.x);
		System.out.println("y:"+y1.y);
		y1.banjing();
		System.out.println("r:"+y1.r);
	}

}
