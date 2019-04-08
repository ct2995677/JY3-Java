package com.neuedu;

public class Kanshu {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.name = "金瓶梅";
		b1.money = 25;
		b1.page = 186;
		b1.zuozhe = "大郎";
		b1.look();
		
		System.out.println("b1的名字:"+b1.name);
		System.out.println("b1的价格:"+b1.money);
		System.out.println("b1的页数:"+b1.page);
		System.out.println("b1的作者:"+b1.zuozhe);
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
		System.out.println("正在看书...");
	}
	public void watch()
	{
		System.out.println("正在读书");
	}

}
