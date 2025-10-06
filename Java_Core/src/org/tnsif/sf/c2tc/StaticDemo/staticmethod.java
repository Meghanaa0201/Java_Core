package org.tnsif.sf.c2tc.StaticDemo;

class PaymentGateway
{
	static void showSupportedBanks()
	{
		System.out.println("Supported Banks : SBI, HDFC,ICICI,Axis");
	}
}


public class staticmethod {

	public static void main(String[] args) {
		PaymentGateway.showSupportedBanks();

	}

}

