package com.tuteedu.Lil_chet;

import java.util.Scanner;

public class SixthExercise {
	public static void main(String[] args) {
		System.out.println("请输入x");
		Scanner sca = new Scanner(System.in);
		int x = sca.nextInt();
		System.out.println("请输入y");
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		System.out.println("两者较大的数为");
		if(x>y) {
			System.out.println(x);
		}else {
			System.out.println(y);
		}
			
	
	}
}