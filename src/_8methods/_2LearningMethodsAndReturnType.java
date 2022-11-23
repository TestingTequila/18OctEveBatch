package _8methods;

public class _2LearningMethodsAndReturnType {

	// WAP a program to perform addition of two numbers

	int num1;
	int num2;

	String fName;
	String lName;

	public void addition1() {
		int sum = num1 + num2;
		System.out.println("Addition1 of " + num1 + " and " + num2 + " is " + sum);
	}

	public int addition2() {
		int sum = num1 + num2;
		System.out.println("Addition2 of " + num1 + " and " + num2 + " is " + sum);
		return sum;
	}

	public void printFullName1() {
		String fullName = fName + lName;
		System.out.println("Full Name 1 : " + fullName);
	}

	public String printFullName2() {
		String fullName = fName + lName;
		System.out.println("Full Name2 : " + fullName);
		return fullName;
	}

}
