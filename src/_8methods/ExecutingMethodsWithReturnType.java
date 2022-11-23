package _8methods;

public class ExecutingMethodsWithReturnType {

	public static void main(String[] args) {

		_2LearningMethodsAndReturnType lmrt = new _2LearningMethodsAndReturnType();
		lmrt.num1 = 12;
		lmrt.num2 = 8;
		// int sum1=lmrt.addition1(); // void

		int sum2 = lmrt.addition2(); // int

		lmrt.fName = "Jason";
		lmrt.lName = "Roger";
		// String fullName1=lmrt.printFullName1(); // void

		String fullName2 = lmrt.printFullName2(); // String

	}

}
