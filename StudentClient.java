package com.stugunali.lil_chet;
import java.util.*;
public class StudentClient {
	
	
	
//	public static void main(String[] args) {
		

//��ʼ���û�������
	static String userName = "Admin";
	static String passWord = "Admin";
	
//����Scanner��
	Scanner scanner = new Scanner(System.in);

	
	
	public static void main(String[] args) {
	StudentClient studentClient = new StudentClient();
	studentClient.welcomePage();
	}
		
//��ӭ����
	public void welcomePage() {
		System.out.println("*******************************��ӭ����ѧ������ϵͳ***********************************");
		System.out.println("1.��½          2.�˳�");
		System.out.println("**************************************************************************************");
//�����û������1��2
		System.out.println("��ѡ��");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println("��ӭ��¼��");
			System.out.println("�������û���");
			String username = scanner.next();
			System.out.println("����������");
			String psw = scanner.next();
			Admin admin = new Admin(username,psw);
			boolean login = login(admin);
			if(login == true)
			{
				System.out.println("��ӭ��"+username+"��½��");
			}else {
				System.out.println("��¼ʧ�ܡ�����");
				welcomePage();
			}
			break;
			
		default:
			break;
		}
		}
		
		
//��½����
	public boolean login(Admin admin)
	{
		System.out.println("��ӭ��¼");
//		�жϴ�����û��������Ƿ�һ��
		if(userName.equals(admin.userName) && passWord.equals(admin.passWord))
		{
			return true;
		}else {
			return false;
		}

	}
//�˳�ϵͳ
	public void exitSystem()
	{
		System.exit(0);
	}
}
