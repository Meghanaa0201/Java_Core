package org.tnsif.sf.c2tc.oops;

class course{
	String coursename="java prgming";
	
	void showcourse()
	{
		System.out.println("course:"+coursename);
	}
}

class student extends course{
	String name="bob";
			
	void showstudent() {
		System.out.println("student:"+name);
	}
}

public class single_inheritance {

	public static void main(String[] args) {
		student obj = new student();
		obj.showcourse();
		obj.showstudent();
	}

}
