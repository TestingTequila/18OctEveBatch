package _15Inheritance_Interface;

public class A implements Base{

	@Override
	public void addition(int a, int b) {
		System.out.println("Addition by A " + (a+b));
	}

	@Override
	public void subtraction(int a, int b) {

		System.out.println("Subtraction by A " + (a - b));
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println("Multiplication by A " + (a * b));

	}

	@Override
	public void division(int a, int b) {
		System.out.println("Division by A " + (a / b));

	}



}
