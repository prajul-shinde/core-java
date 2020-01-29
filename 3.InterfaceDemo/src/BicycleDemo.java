
public class BicycleDemo implements Bicycle {
	int speed = 12;
	int gear = 1;

	void printStates() {
		System.out.println("speed " + speed + " gear " + gear);

	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;

	}

	@Override
	public void slowDown(int decrement) {
		speed = speed - decrement;
	}

	public static void main(String[] args) {
		BicycleDemo b1 = new BicycleDemo();
		BicycleDemo b2 = new BicycleDemo();

		b1.speedUp(100);
		b1.slowDown(50);
		b1.printStates();

		b2.speedUp(10);
		b2.slowDown(5);
		b2.printStates();
	}

}
