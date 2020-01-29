
public class InstanceMethodReference {

	/*
	 * different return types are allowed only rule is that method arguments
	 * must be match
	 */

	void m1() {
		for (int i = 0; i < 10; i++)
			System.out.println("child thread");
	}

	public static void main(String[] args) {
		InstanceMethodReference i1 = new InstanceMethodReference();
		Runnable r = i1::m1;
		Thread t1 = new Thread(r);
		t1.start();

		for (int i = 0; i < 10; i++)
			System.out.println("main thread");

	}

}
