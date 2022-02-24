package chapter4Classes; 

public class ConstructorTest {
	public static void main(String[] args) {
		Employee[] staffs = new Employee[3];
		staffs[0] = new Employee("Harry", 40000);
		staffs[1] = new Employee(60000);
		staffs[2] = new Employee();

		for (Employee staff : staffs)
			System.out.println("name = " + staff.getName() + ", salary = " + 
								staff.getSalary() + ", id = " + staff.getId());

	}
}
