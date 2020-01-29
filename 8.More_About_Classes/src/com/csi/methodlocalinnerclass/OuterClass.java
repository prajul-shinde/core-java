package com.csi.methodlocalinnerclass;

public class OuterClass {
	private int outer_class_data = 1000;

	public void display() {

		// it must be final or effectively final
		int local_data = 50;

		// we cannot invoke this class outside of the method
		class innerclass {
			int inner_class_data = 69;

			public void invoke() {
				System.out.println("accessing outer class data " + outer_class_data);
				System.out.println("accesing local data " + local_data);
				System.out.println("accessing inner class data " + inner_class_data);
			}
		}
		new innerclass().invoke();

	}

	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		obj.display();
	}
}
