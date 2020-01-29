class Student {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class CreateObjectsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();

		s1.setId(1);
		s1.setName("prajul");
		;

		System.out.println(s1.getId() + " " + s1.getName());

		s2.setId(2);
		s2.setName("onkar");
		System.out.println(s2.getId() + " " + s2.getName());

	}

}
