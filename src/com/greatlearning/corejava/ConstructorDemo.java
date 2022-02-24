/*in the above program, there are two constructors of Class Customer, one is unparameterized and the other has
one parameter of type int.
In the above code, we are creating a customer object using the Customer() constructor.
Inside the non-parameterized constructor, there is a line of code this(1), which will call parameterized constructor inside parameterized constructor there is a print statement hi which will get printed.
Note: this keyword refers to the current object in a method or constructor.
After hi, is printed the code flow will come back to the un parameterized constructor and it will print hello.

Code flow
Line 12 --> Line 2 --> Line 3 --> Line 6 -- >Line 7 --> Line 4*/

package com.greatlearning.corejava;
class Customer11 
{
Customer11()

{

this(1);

System.out.print(" hello");

}

Customer11(int x){

System.out.print("hi");

}

}
public class ConstructorDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Customer11 customer = new Customer11();
	}

}
