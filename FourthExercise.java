package com.tuteedu.Lil_chet;

import java.util.Scanner;

public class FourthExercise {
	
	public static void main(String[] args) {
		System.out.println("������һ��1~1000����");
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();
		int b , c , d , e , sum;
		b = a / 100 % 10;
		c = a / 10 % 10;
		d = a % 10;
		sum = b + c + d;
		System.out.println("���Ϊ:"+sum);
		
	}
}
