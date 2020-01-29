package com.csi.innerclassexample;

public class OuterClass {
	private int outerData = 1000;

	class InnerClass {
		int innerData = 5000;

		public void invoke() {
			System.out.println("inner class invoke method is called " + outerData);

			// to call outer class display method.
			OuterClass.this.display();

		}

		private void display() {
			System.out.println("inner class display method");
		}
	}

	private void display() {
		System.out.println("outerclass display method is called");
		InnerClass innerClass = new InnerClass();
		System.out.println("accessing innerclass data " + innerClass.innerData);
	}
}
