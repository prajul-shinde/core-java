class Sample {
	Sample() {
		System.out.println("sample class constructor executing");
	}

}

interface Interf2 {
	public Sample get();
}

public class ConstructorReference {
	public static void main(String[] args) {
		Interf2 i2 = Sample::new;
		Sample s = i2.get();
		Sample s2 = i2.get();
		Sample s3 = i2.get();
		// three objects are created here
		// we are creating objects here
		// in this get method referring to sample class constructor
	}
}
