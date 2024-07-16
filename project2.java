package com.day2;

import java.util.Scanner;

public class project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k=new Scanner(System.in);
		System.out.println("enter a and b values:");
		int a=k.nextInt();
		int b=k.nextInt();
		System.out.println("------Arithmetic operator-------");
		System.out.println("add="+(a+b));
		System.out.println("sub"+(a-b));
		System.out.println("mul"+(a*b));
		System.out.println("div"+(a/b));
		System.out.println("mod"+(a%b));
		System.out.println("-----increment and decrement operators------");
		System.out.println("value of a="+a);
		System.out.println("value after incrementing with 1="+(++a));
		System.out.println("value after decrementing with 1="+(--a));
		System.out.println("-----Bitwise Operators--------");
		System.out.println("Bitwise AND="+(a&b));
		System.out.println("Bitwise OR="+(a|b));
		System.out.println("------Relational and Ternary operators------");
		int x=(a>b)?1:0;
		System.out.println("the value of x="+x);
		System.out.println("------Shift Operator-------");
		System.out.println("rilght shift of b with 2="+(b>>2));
		System.out.println("left shift of a with 3="+(a<<3));
		
		
	}

}
