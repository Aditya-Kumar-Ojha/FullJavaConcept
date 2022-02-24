package com.greatlearning.corejava;
class ConsDemo
{
	ConsDemo()
	{
		System.out.println("I am default constructor.");
	}
	ConsDemo( int A,float B, String Name, char C )
	{
	 System.out.println("I am Parameterized constructor. I take various arguments as input.");
	 //int square1=A*A;
	 //float square2=B*B;
	 System.out.println(A*A);
	 System.out.println(B*B);
	 System.out.println(Name);
	 System.out.println(C);
	}
}
public class ConstructorDemo3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ConsDemo OBJ1=new ConsDemo();
		ConsDemo OBJ2=new ConsDemo(99,34.5f,"Aditya Ojha",'B');
		
	}

}
