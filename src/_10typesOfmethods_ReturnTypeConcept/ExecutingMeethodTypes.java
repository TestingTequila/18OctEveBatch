package _10typesOfmethods_ReturnTypeConcept;

public class ExecutingMeethodTypes {

	public static void main(String[] args) {
//		MethodWithReturnTypeMWithoutParameters maths = new MethodWithReturnTypeMWithoutParameters();
//		maths.a=12;
//		maths.b=8;
//		//int finalSum=maths.addition1(); // void
//		
//		int totalSum=maths.addition2(); // int
////		System.out.println(totalSum*5);
//		
//		ChristmasBonus jason = new ChristmasBonus();
//		int finalSalary=jason.calaculateSalary(3000, 4000);
//		System.out.println("Salary with bonus for jason is : " + (finalSalary + 2000));
//		
//		ChristmasBonus kerrie = new ChristmasBonus();
//		int finalSalary1=kerrie.calaculateSalary(4000, 5000);
//		System.out.println("Salary with bonus for kerrie is : " + (finalSalary1 + 2000));

		NameOnIdCard name = new NameOnIdCard();
		String nameOnCard=name.empName("Jason", "Roger");
		System.out.println("Name to be printed on ICard is : " + nameOnCard + " MEDMA");
	}

}
