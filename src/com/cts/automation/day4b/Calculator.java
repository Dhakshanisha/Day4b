package com.cts.automation.day4b;

import java.util.Scanner;

public class Calculator {
	
	public void calculate()
	{
		int x;
		float y;
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int x =sc.nextInt();
		float y =sc.nextFloat();
		Calculator c = new Calculator();
		c.calculate();
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		
	}

}
