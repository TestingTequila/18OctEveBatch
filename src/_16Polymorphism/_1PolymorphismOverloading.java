package _16Polymorphism;

public class _1PolymorphismOverloading {

	public void addition(int a, int b)
	{
		System.out.println((a+b));
	}
	
	public void addition(double a, int b)
	{
		System.out.println((a+b));
	}
	
	public void addition(int a, double b)
	{
		System.out.println((a+b));
	}
	
	public void addition(double a, double b)
	{
		System.out.println((a+b));
	}
	
	public void addition(double a, double b, int c)
	{
		System.out.println("Addition of numbers is : " + (a+b)); // 12+8
	}
	
	public void move(String leftKey)
	{
		System.out.println("Move left");
	}
	
	public void move(int rightKey)
	{
		System.out.println("Move right");
	}
	
	public void move(int rightKey, String topArrowKey)
	{
		System.out.println("He will fire");
	}
}
