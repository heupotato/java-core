package chapter5ArrayList;

public abstract class Person {
	public abstract String getDescription(); 
	protected String name; 
	
	public Person (String n)
	{
		name = n; 
	}
	
	public String getName() {
		return name; 
	}
}
