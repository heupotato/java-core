package chapter5;

import chapter4Classes.Employee;

public class ManagerTest {

	public static void main(String[] args) {
		Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		boss.setBonus(5000);
		
		Employee[] staffs = new Employee[3];
		staffs[0] = boss;
		staffs[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staffs[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
		
		for (Employee staff : staffs)
			System.out.println(staff.getName() + " " + staff.getSalary());


	}

}
