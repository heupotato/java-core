package chapter6Interface; 
import java.util.*;

/**
 *  This is a class comment
 */
public class Employee implements Comparable<Employee>{
	//static field
	private static int nextId = 1; 
	
	private String name; 
	private double salary; 
	private Date hireDay; 
	private int id; 
	
	// static initialization block
	static
	{
		Random generator = new Random();
		// set nextId to a random number between 0 and 9999
		nextId = generator.nextInt(10000);
	}

	
	// object initialization block
	{
	id = nextId;
	nextId++;
	}

	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = calendar.getTime();
	}
	
	public Employee(String n, double s) {
		name = n; 
		salary = s; 
	}
	
	public Employee(double s)
	{
		// calls Employee(String, double)
		this("Employee #" + nextId, s);
		nextId++;
	}
	
	public Employee()
	{
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return (Date) hireDay.clone();
	}

	public int getId() {
		return id; 
	}
	
	/**
	* Raises the salary of an employee.
	* @param byPercent the percentage by which to raise the salary (e.g. 10
	means 10%)
	* @return the amount of the raise
	*/
	public void raiseSalary (double byPercent) {
		salary += salary * byPercent / 100; 
	}
	
	public boolean equals(Employee other)
	{
		return name.equals(other.name);
	}
	
	public void setId() {
		id = nextId; 
		nextId++; 
	}
	
	//static method
	public static int getNextId()
	{
		return nextId; // returns static field
	}
	
	@Override
	public int compareTo(Employee other) {
		return Double.compare(salary, other.salary);
	}
	
	public static void main(String[] args) // unit test
	{
		Employee e = new Employee("Romeo", 50000, 2003, 3, 31);
		e.raiseSalary(10);
		System.out.println(e.getName() + " " + e.getSalary());
	}
}
