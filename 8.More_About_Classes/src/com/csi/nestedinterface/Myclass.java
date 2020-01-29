package com.csi.nestedinterface;

//class with nested interface
class A {
	public interface TestInterface {
		void displayValue(String value);
	}
}

// class implementing nested interface
class B implements A.TestInterface {

	@Override
	public void displayValue(String value) {
		System.out.println("value is: " + value);
	}

}

public class Myclass {

	public static void main(String[] args) {
		// reference of b class assigned to nested interface
		A.TestInterface obj = new B();
		obj.displayValue("prajul_shinde");
	}

}
