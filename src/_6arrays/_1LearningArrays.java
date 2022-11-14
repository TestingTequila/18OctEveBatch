package _6arrays;

public class _1LearningArrays {

	public static void main(String[] args) {

		int[] numbers = { 12, 34, 45, 56, 67, 1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 14, 15, 3567, 78, 89, 99, 88, 77, 66, 55,
				44, 33, 22, 11 };
		System.out.println("NUMBERS ARRAY " + numbers.length);

		/*
		 * for (int x = 0; x < numbers.length; x++) { System.out.println(numbers[x]); }
		 */

		String[] names = { "Harsha", "Zaida", "Vedika", "Kerrie", "Ben" , "Ashish"};
		int x=0;
		while(x<names.length)
		{
			System.out.println(names[x]);
			x++;
		}

		String[] menuNames = { "HOME", "GIFT CERTIFICATE", "BRANDS", "BLOGS", "CONTACT US" };

	}

}
