package com.edu.lil_chet;

public abstract class WeiYunSuan {
	public static void main(String[] args) {
		int a = 46;
		int b =32;
		//a^=b == a=a^=b;
		a^=b;
		b^=a;
		a^=b;
		System.out.println(a);
		System.out.println(b);
	}
}
