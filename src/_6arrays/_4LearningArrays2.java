package _6arrays;

public class _4LearningArrays2 {

	public static void main(String[] args) {

		// 1. dataType[] arrayName = {value1,value2, value3, value4......};

		// 2. dataType[] arrayName = new dataType[countOfItems];
		int[] numbers = new int[5];

		numbers[0] = 55;
		numbers[1] = 607;
		numbers[2] = 100;
		numbers[3] = 455;
		numbers[4] = 65;

		for (int num : numbers) {
			System.out.println(num);
		}

		String[] menuItems = new String[3];
		menuItems[0] = "Home";
		menuItems[1] = "Contact Us";
		menuItems[2] = "Register";

		for (String s : menuItems) {
			System.out.println(s);
		}

	}

}
