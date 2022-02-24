/**Create two separate classes Customer & CustomerDriver inside  com.greatlearning.corejava; package 
Create various variables in class Customer of different access modifiers such as (private, public, protected) and initialize them with some values
Try accessing and printing them in CustomerDriver class.
 * 
 */
package com.greatlearning.corejava;


class Customer
{
	public String firstName = "Harshit";
	public String lastName = "Choudhary";
	protected int age = 25;
	protected String city = "Bengaluru";
	protected String password = "Password@1";
}
public class CustomerDriver
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Customer obj=new Customer();
		System.out.println(obj.firstName);
		System.out.println(obj.lastName);
		System.out.println(obj.age);
		System.out.println(obj.city);
		System.out.println(obj.password);
		
	}

}
