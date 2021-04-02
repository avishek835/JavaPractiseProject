package com.HumanConstructor;

public class Human {
	
	 String name;
	 int age;
	
	public Human(String name, int age)
	{
		this.name=name;
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String args[])
	{
		
		Human h=new Human("Avi", 35);
		
	}

}
