package com.yl_Array;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Test {

	public static void main(String[] args) {
	ObjectArrays oa = new ObjectArrays();
	oa.add(5);
	oa.add(9);
	oa.add(49);
	oa.add(78);
	System.out.println("-----------------------");
	System.out.println(oa.size());
	System.out.println("-----------------------");
	oa.show();
	oa.delete(2);
	oa.show();
	System.out.println("-----------------------");
	System.out.println(oa.get(0));
	System.out.println("-----------------------");
	oa.insert(2, 99);
	oa.show();
	}

}
