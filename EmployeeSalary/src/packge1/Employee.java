package packge1;

public class Employee {
	int basic;
	int bonus;
	
	private String name;

	public void setdata(int basic, int bonus, String name) {
		this.basic = basic;
		this.bonus = bonus;
		this.name = name;
	}

	public void display() {
		int total= (basic+bonus);
		System.out.print("Name of the enployee: " + this.name + ",");
		System.out.print(" Basic: " + this.basic + ",");
		System.out.print(" And Bonus: " + this.bonus + ",");
		System.out.print(" Total Salary: " + total + "\n");


	}

	public static void main(String[] args) {

		Employee Emp1 = new Employee();
		Emp1.setdata(4000, 500, "Mamun");
		Emp1.display();
                
  		Employee Emp2 = new Employee();
		Emp2.setdata(6000, 550, "Arif");
		Emp2.display();

		Employee Emp3 = new Employee();
		Emp3.setdata(10000, 1000, "Lutfor");
		Emp3.display();

		

	}
}
