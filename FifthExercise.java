package com.tuteedu.Lil_chet;

import java.util.Scanner;

public class FifthExercise {

		public static void main(String[] args) {
			
			System.out.println("������һ����");
			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			
			if(x%2==0)
			{
				System.out.println("���������ż��");
			}else
			{
				System.out.println("�������������");
			}
			System.out.println("x��ֵΪ��" + x);
		}
}
