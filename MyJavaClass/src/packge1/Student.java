package packge1;

public class Student {
	int roll;
	float mark;
	private String name;

	public void setdata(int roll, float mark, String name) {
		this.roll = roll;
		this.mark = mark;
		this.name = name;
	}

	public void display() {

		System.out.print("The studet Name is " + this.name + "");
		System.out.print(" roll is " + this.roll + "");
		System.out.print(" And mark is " + this.mark + "\n");

	}

	public static void main(String[] args) {

		Student S1 = new Student();
		S1.setdata(201, 95.59f, "Shakil");
		S1.display();

		Student S2 = new Student();
		S2.setdata(202, 98.59f, "Arif");
		S2.display();

		Student S3 = new Student();
		S3.setdata(203, 90.59f, "Mamun");
		S3.display();

		Student S4 = new Student();
		S4.setdata(204, 96.59f, "Nazmul");
		S4.display();

	}
}
