package org.tnsif.sf.c2tc.sr_developer;

import org.tnsif.sf.c2tc.junior_developer.*;// 1st method as it import all the related packages automatically

// import org.tnsif.sf.c2tc.junior_developer.kia_airbags;// 2nd method import packagename.classname;


public class kia_internals {

	public static void main(String[] args) {
		
		// org.tnsif.c2tc.junior_developer.kia_airbags obj = new  org.tnsif.c2tc.junior_developer.kia_airbags();     //third way- fully qualified nMW

		kia_airbags obj = new kia_airbags();
		obj.disp_airbags();
		
		kia_speedlimit obj1 = new kia_speedlimit();
		obj1.disp_speedlimit();
	}

}
