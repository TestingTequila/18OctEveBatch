package _6arrays;

public class _2LearningArrayswithAdvancedForLoop {

	public static void main(String[] args) {

		int[] numbers = { 12, 34, 45, 56, 67, 1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 14, 15, 3567, 78, 89, 99, 88, 77, 66, 55,
				44, 33, 22, 11 };
		
		/*
		 * for(int num: numbers) { System.out.println(num); }
		 */

		String[] names = { "Harsha", "Zaida", "Vedika", "Kerrie", "Ben", "Ashish" };
		
		/*
		 * for(String name: names) { System.out.println(name); }
		 */

		String[] menuNames = { "HOME", "GIFT CERTIFICATE", "BRANDS", "BLOGS", "CONTACT US" };
		
		for(String menu : menuNames)
		{
			System.out.println(menu);
		}

	}

}
