package com.java1.lil_chet;

public class Circle extends Shape{
	int r;
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Circle(int r) {
		super();
		this.r = r;
	}
	public double area(int r) {
		
		return Math.PI*r*r;
	}
}
