interface Interf3 {
	public abstract int square(int n);
}

public class SqareIt {

	public static void main(String[] args) {
		Interf3 i3 = n -> n * n;
		System.out.println(i3.square(4));
		System.out.println(i3.square(5));
		System.out.println(i3.square(6));

	}

}
