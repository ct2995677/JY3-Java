package com.neuedu;

public class Kanshu {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.name = "��ƿ÷";
		b1.money = 25;
		b1.page = 186;
		b1.zuozhe = "����";
		b1.look();
		
		System.out.println("b1������:"+b1.name);
		System.out.println("b1�ļ۸�:"+b1.money);
		System.out.println("b1��ҳ��:"+b1.page);
		System.out.println("b1������:"+b1.zuozhe);
		b1.watch();
	}
	
	
	
}
class Book{
	String name;
	int page;
	double money;
	String zuozhe;
	public void look()
	{
		System.out.println("���ڿ���...");
	}
	public void watch()
	{
		System.out.println("���ڶ���");
	}

}
