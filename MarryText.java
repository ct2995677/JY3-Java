package com.Lil_Chet;

/**
  * ������
 * @author apple
 *
 */
public class MarryText {
	
	public static void main(String[] args) {
		Person boy = new Person("tj123456","�żһ�",'��',(short)22,false,"123829938847536278","���","26776389100",null);
		Person girl = new Person("tj654321","���",'Ů',(short)20,false,"120938754657281989","����","26788763647",boy);
		boolean marry = boy.marry(girl);
		System.out.println(marry);
	}
}
