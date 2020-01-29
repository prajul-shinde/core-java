package com.csi.staticinnerclass;

public class OuterClass {
	private static int static_data = 100;
	private int instance_data = 50;

	public static class InnerClass {
		private int inner_class_data = 1000;

		public void display() {

			// cannot access instance data
			// System.out.println("access instance data " +instance_data);
			System.out.println("accessing static data" + static_data);
			System.out.println("access innerclass data " + inner_class_data);
			OuterClass.display();
		}

	}

	public static void display() {
		System.out.println("outerclass display method is called");
		InnerClass inr = new InnerClass();
		System.out.println("access inner class data in outer class " + inr.inner_class_data);

	}
}
