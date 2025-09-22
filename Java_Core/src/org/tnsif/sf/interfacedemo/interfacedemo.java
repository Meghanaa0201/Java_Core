package org.tnsif.sf.interfacedemo;

class Smartlight implements smartdeviceinterface
{

	@Override
	public void turnOn() {
		System.out.println("smart light is on");

	}

	@Override
	public void turnOff() {
		System.out.println("smart light is off");
	}

	@Override
	public void getStatus() {
		System.out.println("smart light is in stand by mode");

	}
	
}


public class interfacedemo {

	public static void main(String[] args) {
		smartdeviceinterface obj = new Smartlight (); // by using smartdeviceinterface...the previous interface ali osad methods if we add ...they directly we can access .....Smartlight andre we can ... add anything 
		
		obj.turnOn();
		obj.turnOff();
		obj.getStatus();
	}

}
