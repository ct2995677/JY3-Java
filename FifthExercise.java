package com.tuteedu.Lil_chet;

import java.util.Scanner;

public class FifthExercise {

		public static void main(String[] args) {
			
			System.out.println("请输入一个数");
			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			
			if(x%2==0)
			{
				System.out.println("您输入的是偶数");
			}else
			{
				System.out.println("您输入的是奇数");
			}
			System.out.println("x的值为：" + x);
		}
}
