package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int a=10;
		int b=15;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		int x=100;
		int y=90;
		
		boolean result=x>y;
		System.out.println(result);
		
		result=x==y;
		System.out.println(result);
		System.out.println(x==y);
		System.out.println(x=y);
		
		boolean result1=x==y;
		System.out.println(result1);
		System.out.println("______________");
		byte num=10;
		byte num1=11;
		boolean boo=num>=num1;
		System.out.println(boo);
	}

}
