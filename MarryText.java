package com.Lil_Chet;

/**
  * 测试类
 * @author apple
 *
 */
public class MarryText {
	
	public static void main(String[] args) {
		Person boy = new Person("tj123456","张家辉",'男',(short)22,false,"123829938847536278","香港","26776389100",null);
		Person girl = new Person("tj654321","凤姐",'女',(short)20,false,"120938754657281989","湖南","26788763647",boy);
		boolean marry = boy.marry(girl);
		System.out.println(marry);
	}
}
