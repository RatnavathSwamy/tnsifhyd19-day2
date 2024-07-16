package com.day2;

public class constructordefault {
	private String driver;
	private String engine;
	public int  speed;
	constructordefault()
	{
		driver="seated";
		engine="on";
		speed=12;
	}
	public void run()
	{
	
	if((driver.equals("seated"))&&(engine.equals("on"))&&(speed>=12))
	{
		System.out.println("the car is in running state");
	}
	else 
	{
		System.out.println("the car is nor in running state");
	}
	}

}

