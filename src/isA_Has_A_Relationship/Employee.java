package isA_Has_A_Relationship;

public class Employee {
	int emp_id;
	String emp_name;

	Address add;

	public Employee(int emp_id, String emp_name, Address add) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.add = add;

	}

	public static void main(String[] args) {
		Address add = new Address("Mumbai", "Maharashtra", "India");

		Employee e = new Employee(1, "Sudarshan", add);
		
		System.out.println("Emp_id="+e.emp_id);
		System.out.println("Emp_name="+e.emp_name);
		
		System.out.println("City="+e.add.City);
		System.out.println("State="+e.add.State);
		System.out.println("Country="+e.add.Country);
		

		
		
		
	}

}
