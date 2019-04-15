package com.java1.lil_chet;

public class SingleChoice extends Question{
	String[] options ;
	int answer;
	public SingleChoice(String text,String[] options, int answer) {
		super();
		this.text=text;
		this.options = options;
		this.answer = answer;
	}
	public SingleChoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
