package org.tnsif.sf.c2tc.oops;

public class Abstraction_Demo {
	public static void main(String[] args) {
		Mahesh obj = new Suresh();
		
		obj.calling();
		obj.AIintegration();
		obj.SatelliteComm();
		obj.healthMonitoring();
	}
		
}

abstract class Mahesh
{
	public void calling()
	{
		System.out.println("phone is calling");
	}
	
	public abstract void AIintegration();
	public abstract void SatelliteComm();
	public abstract void healthMonitoring();
	
}

abstract class Ramesh extends Mahesh{

	@Override
	public void AIintegration() {
		System.out.println("Phone is integrated with AI");
	}

	public abstract void SatelliteComm();

	public abstract void healthMonitoring();
}

class Suresh extends Ramesh{

	@Override
	public void SatelliteComm() {
		System.out.println("phone is integrated with SatelliteComm");
		
	}

	@Override
	public void healthMonitoring() {
		System.out.println("Phone is integrated with health monitoring");
		
	}
	
}

