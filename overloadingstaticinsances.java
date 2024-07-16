package com.day2;

public class overloadingstaticinsances {
	void display()
	{
		System.out.println("this is content of instance");
	}
	void display(int a,double b)
	{
		System.out.println("addition:"+(a+b));
	}
	static void display(int a)
	{
		System.out.println("value of a"+a);
	}
	static double display(int a,int b)
	{
		return a+b;
		
	}
//NOTE:OVERLOADING ACCEPT BOTH STATIC AND INSTACE METHODS AND VARIABLES

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadingstaticinsances k=new overloadingstaticinsances();
		k.display();//instance method can be called by object
		k.display(4,4.6);
		overloadingstaticinsances.display(4);//static method can called by class name only
		System.out.print(overloadingstaticinsances.display(6,8));
		
		

	}

}
