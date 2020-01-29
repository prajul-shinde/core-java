
//this is functional interface having only one abstract method

interface Interf2 {
	public abstract void m1();
}

public class HelloWorld {

	public static void main(String[] args) {

		/*
		 * the compiler knows that there is only one method in functional
		 * interface so no need to pass an argument
		 */

		Interf2 i = () -> System.out.println("welcome to lambda expression");
		i.m1();
	}
}
