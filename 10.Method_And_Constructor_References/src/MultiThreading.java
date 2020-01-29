/*this is program for static method reference in java
*/

public class MultiThreading {

	public static void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");

		}
	}

	public static void main(String[] args) {
		/*
		 * Runnable r = () -> { for (int i = 0; i < 10; i++) {
		 * System.out.println("child thread"); } };
		 */

		// we can reuse this reference
		// run method referring the test class m1 method here
		Runnable r = MultiThreading::m1;

		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

}
