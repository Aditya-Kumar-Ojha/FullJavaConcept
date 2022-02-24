package com.greatlearning.corejava;
    class ConstructorDemo1
     {
    	ConstructorDemo1()
    	{
    		System.out.println("Hello Contructor My name is Aditya Ojha & I am trying to learn you");
    	}
    	ConstructorDemo1(String FistName, String LastName, int age)
    	{
    		
    		System.out.println(FistName);
    		System.out.println(LastName);
    		System.out.println(age);
    		
    	}
     }
	class ConsDemo2
	{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ConstructorDemo1 obj=new ConstructorDemo1();
		ConstructorDemo1 obj1=new ConstructorDemo1("Aditya","Ojha",24);
	}

}
