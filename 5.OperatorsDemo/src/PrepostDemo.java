
public class PrepostDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		int y;
		i++;
		// result is 4
		System.out.println(i);
		++i;
		// result is 5
		System.out.println(i);

		y = i++;
		// first i will be assign to y then increment so y=5 and i =6
		System.out.println(y);
		System.out.println(i);

		y = ++i;
		// y will be 7 so does i
		System.out.println(y);
		System.out.println(i);
	}

}
