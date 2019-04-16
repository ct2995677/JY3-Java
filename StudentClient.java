package com.stugunali.lil_chet;
import java.util.*;
public class StudentClient {
	
	
	
//	public static void main(String[] args) {
		

//初始化用户名密码
	static String userName = "Admin";
	static String passWord = "Admin";
	
//创建Scanner类
	Scanner scanner = new Scanner(System.in);

	
	
	public static void main(String[] args) {
	StudentClient studentClient = new StudentClient();
	studentClient.welcomePage();
	}
		
//欢迎界面
	public void welcomePage() {
		System.out.println("*******************************欢迎来到学生管理系统***********************************");
		System.out.println("1.登陆          2.退出");
		System.out.println("**************************************************************************************");
//接收用户输入的1和2
		System.out.println("请选择：");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println("欢迎登录！");
			System.out.println("请输入用户名");
			String username = scanner.next();
			System.out.println("请输入密码");
			String psw = scanner.next();
			Admin admin = new Admin(username,psw);
			boolean login = login(admin);
			if(login == true)
			{
				System.out.println("欢迎您"+username+"登陆！");
			}else {
				System.out.println("登录失败。。。");
				welcomePage();
			}
			break;
			
		default:
			break;
		}
		}
		
		
//登陆方法
	public boolean login(Admin admin)
	{
		System.out.println("欢迎登录");
//		判断传入的用户名密码是否一致
		if(userName.equals(admin.userName) && passWord.equals(admin.passWord))
		{
			return true;
		}else {
			return false;
		}

	}
//退出系统
	public void exitSystem()
	{
		System.exit(0);
	}
}
