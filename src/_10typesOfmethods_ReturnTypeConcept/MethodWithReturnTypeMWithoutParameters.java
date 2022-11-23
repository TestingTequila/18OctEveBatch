package _10typesOfmethods_ReturnTypeConcept;

public class MethodWithReturnTypeMWithoutParameters {

	int a;
	int b;
	
	public void addition1()
	{
		int sum = a+b;
		System.out.println("Result of addition1 method without retrunType- void " + sum);
	}
	
	public int addition2()
	{
		int sum = a+b;
		System.out.println("Result of addition2 method with returnType " + sum);
		return sum;
	}

}
