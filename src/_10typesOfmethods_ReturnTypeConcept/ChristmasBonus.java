package _10typesOfmethods_ReturnTypeConcept;

public class ChristmasBonus {

	//1. Calculate salary
	//2. Bonus of 2000
	
	public int calaculateSalary(int basicSal, int travelAlnc)
	{
		int salary = basicSal+ travelAlnc;
		System.out.println("Total salary of employee is : " + salary+ "$");
		return salary;
	}
}
