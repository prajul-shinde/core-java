interface Interf1 {
	public abstract void sum(int a, int b);
}

public class Addition {

	public static void main(String[] args) {

		/*
		 * compiler automatically determines arguments as there is only one
		 * method
		 */

		Interf1 i = (a, b) -> System.out.println("the sum is " + (a + b));
		i.sum(3, 4);
		i.sum(6, 6);
		i.sum(5, 5);
	}

}
