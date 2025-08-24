package org.tnsif.sf.c2tc.basicsjava;

public class variabledemo {

	int a = 10; // instance variable
	void print() 
	{
		String message = "hello"; //local variable 
		System.out.println(message);
	}
	
	static String msg="hello hi "; // static variable
	
	public static void main(String[] args) {
		variabledemo obj =new variabledemo();
		System.out.println("the value of a " +obj.a);
		obj.print();
		System.out.println(msg);
	}

}
