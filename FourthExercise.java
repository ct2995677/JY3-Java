package com.tuteedu.Lil_chet;

import java.util.Scanner;

public class FourthExercise {
	
	public static void main(String[] args) {
		System.out.println("请输入一个1~1000的数");
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();
		int b , c , d , e , sum;
		b = a / 100 % 10;
		c = a / 10 % 10;
		d = a % 10;
		sum = b + c + d;
		System.out.println("结果为:"+sum);
		
	}
}
