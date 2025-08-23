package java_core;

public class variabledemo {

	int a = 10; // instance var
	void print() 
	{
		String message = "hello"; //local variable 
		System.out.println(message);
	}
	
	static String msg="hello hi "; // static var
	
	public static void main(String[] args) {
		variabledemo obj =new variabledemo();
		System.out.println("the value of a " +obj.a);
		obj.print();
		System.out.println(msg);
	}

}
