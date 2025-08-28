package org.tnsif.sf.c2tc.oops;

public class Fooditem {

	//properties or state
	
	String name ;
	double price;
	String category;
	
	//Behavior
	
	void displayDetails() {
		System.out.println("food name " +name);
		System.out.println("food price " +price);
		System.out.println("food category" +category);
		System.out.println("-------------------------");
	}
	
	
	public static void main(String[] args) {

		Fooditem obj = new Fooditem();
		obj.name = "burger";
		obj.price = 50.6;
		obj.category="Fast Food";
		
		Fooditem obj1 = new Fooditem();
		obj1.name = "paneer pizza";
		obj1.price = 200.67;
		obj1.category="Italian";
		
		obj.displayDetails();
		obj1.displayDetails();
	
	}

}
