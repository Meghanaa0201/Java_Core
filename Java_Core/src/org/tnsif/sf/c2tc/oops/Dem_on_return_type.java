package org.tnsif.sf.c2tc.oops;

class Add
{
	int a=3;
	int b=8;
	
//
//	int add()
//	{
//		return a+b;
//	}
	
	void add()
	{
		System.out.println(a+b);
	}
}


public class Dem_on_return_type {

	public static void main(String[] args) {
		Add a1=new Add();
		a1.add();
		
//		System.out.println(a1.add());
	}

}
