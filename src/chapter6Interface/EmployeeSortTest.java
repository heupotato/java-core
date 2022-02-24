package chapter6Interface;

import java.util.*;

public class EmployeeSortTest {
	public static void main(String[] args) {
		Employee[] staffs = new Employee[3]; 
		staffs[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
		staffs[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staffs[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
		
		Arrays.sort(staffs);
		
		for (Employee staff : staffs)
			System.out.println("name=" + staff.getName() + ",salary=" + staff.getSalary());
	}
}
