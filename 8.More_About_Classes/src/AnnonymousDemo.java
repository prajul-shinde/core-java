
public class AnnonymousDemo {

	interface Myinterface {
		void display();
	}

	/*
	 * class MyinterfaceImpl implements Myinterface {
	 * 
	 * @Override public void display() { System.out.println("welcome"); }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		/*
		 * instead of creating class and implementing interface we can create
		 * Anonymous class its inside method so make it only if u wanna perform
		 * task only once
		 */
		Myinterface myinterface = new Myinterface() {
			// this ain't object nigga its anonymous class
			@Override
			public void display() {
				System.out.println("this is annonomous class now gtfo");
			}
		};
		myinterface.display();
	}

}
