
public class NestedClassDemo {

	int x = 2;
	// int a=y+2;

	static class StaticNestedClass {
		// int y = x + 2;
		int z = 3;

		NestedClassDemo.StaticNestedClass in = new NestedClassDemo.StaticNestedClass();
	}

	class InnerClass {
		int y = x + 2;
		// int w=z+2;
	}
}
