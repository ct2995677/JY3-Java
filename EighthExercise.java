package com.tuteedu.Lil_chet;

public class EighthExercise {
	public static void main(String[] args) {
		int x = 1;
		int sum = 0;
		while(x<=100 ){
			if (x%2!=0) {
				sum+=x;
//				sum=sum+x;
			}
			x++;
		}
		System.out.println(sum);
	}
}
