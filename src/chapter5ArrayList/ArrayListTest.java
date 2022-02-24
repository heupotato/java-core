package chapter5ArrayList;

import java.util.*;
import static java.lang.System.*; 

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> staffs = new ArrayList<>(); 
		staffs.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
		staffs.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
		staffs.add(new Employee("Tony Tester", 40000, 1990, 3, 15));
		
		for (Employee staff : staffs)
		{
			staff.raiseSalary(5);
			out.println(staff.toString());
		}
		
	
	}

}
