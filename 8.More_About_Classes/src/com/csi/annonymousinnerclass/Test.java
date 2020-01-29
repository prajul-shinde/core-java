package com.csi.annonymousinnerclass;

public class Test {

	public static void main(String[] args) {

		MyInterface myInterface = new MyInterfaceImpl();
		myInterface.display();
		System.out.println("_______________________________________________________");

		MyInterface myInterface2 = new MyInterface() {

			@Override
			public void display() {
				System.out.println("welcome to annonymous class");
			}
		};
		myInterface2.display();
		System.out.println("_______________________________________________________");

		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("my task");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}
