package com.csi.classdemo;

class Bicycle {
	int cadence = 0;
	int speed = 0;
	int gear = 1;

	void changeCadence(int newValue) {
		cadence = newValue;
	}

	void changegear(int newValue) {
		gear = newValue;
	}

	void speedUp(int increment) {
		speed = speed + increment;
	}

	void slowDown(int decrement) {
		speed = speed - decrement;
	}

	void printStates() {
		System.out.println(" cadence " + cadence + " speed " + speed + " gear " + gear);
	}
}

public class BycycleDemo {

	public static void main(String[] args) {
		Bicycle b1 = new Bicycle();
		Bicycle b2 = new Bicycle();

		b1.changeCadence(2);
		b1.changegear(2);
		b1.speedUp(40);
		b1.slowDown(10);
		b1.printStates();

		b2.changeCadence(3);
		b2.changegear(4);
		b2.speedUp(100);
		b2.slowDown(50);
		b2.printStates();

	}

}
