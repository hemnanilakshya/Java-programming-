package com.qa.type.casting;

public class ImplicitExplicit {

	public static void main(String[] args) {
		int num=10;
		float result=num;
		System.out.println("result is"+result);
		
		double value=100;
		int v1=(int) value;
		System.out.println(v1);
	}

}
