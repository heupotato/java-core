package chapter5Abstract;

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
