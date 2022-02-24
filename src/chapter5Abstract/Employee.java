package chapter5Abstract;
import java.util.*;

public class Employee extends Person{
	private double salary; 
	private Date hireDay; 
	
	public Employee(String n, double s, int year, int month, int day) {
		super (n); 
		salary = s; 
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day); 
		hireDay = calendar.getTime(); 
	}
	
	public double getSalary(){
		return salary; 
	}
	
	public Date getHireDay() {
		return hireDay; 
	}
	
	public String getDescription()
	{
		return String.format("an employee with a salary of $%.2f", salary);
	}
	
	public void raiseSalary(double byPercent) {
		salary += salary * byPercent/100; 
	}
	
	@Override public boolean equals (Object otherObject) {
		if (this == otherObject) return true; 
		
		if (otherObject == null) return false;
		if (getClass() != otherObject.getClass())
		return false;
		
		
		Employee other = (Employee) otherObject;
		
		return name.equals(other.name)
			&& salary == other.salary
			&& hireDay.equals(other.hireDay);
	}
	
	public int hashCode() {
		return Objects.hash(name, salary, hireDay); 
	}
	
	public String toString() {
		return getClass().getName() + "[name=" + name + ", salary=" +
				salary + ", hireDay=" + hireDay + "]"; 
	}
}
