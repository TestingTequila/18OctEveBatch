package _12oops;

public class _1Encapsulation {
//  Encapsulation
//	Encapsulation in Java is the process by which variables 
//	and methods are integrated as a single unit. 
	
//	By encapsulating a class's variables, 
//	other classes cannot access them, and only the methods of the class can access them.
		
	private int salary;
	private String name;
	
	public void setName(String name)
	{
		if(name.equalsIgnoreCase("Kerrie"))
		{
			System.out.println("Not an employee of this organization");
		}
		else
		{
			this.name=name;
		}
		
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public void setSalary(int salary)
	{
		if(salary>15000 && name.equalsIgnoreCase("Kerrie"))
		{
			System.out.println("Please check the amount - Its incorrect");
		}
		else
		{
			this.salary=salary;
		}
		
	}
	
	public int getSalary()
	{
		return salary;
	}
}

