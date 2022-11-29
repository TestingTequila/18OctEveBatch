package _18static;

public class ExecutingStatic {

	public static void main(String[] args) {

		
		_1LearningStatic.x=10;
		_1LearningStatic.empId(12);
		System.out.println(_1LearningStatic.x);
		
		_1LearningStatic.x=100;
		
		_1LearningStatic.x=1000;

		System.out.println("ls Object value of X: "+_1LearningStatic.x);
		System.out.println("ls1 Object value of X: "+_1LearningStatic.x);
		System.out.println("ls2 Object value of X: "+_1LearningStatic.x);
		
		
		// If you have to use some method or variable very frequently, without making changes to it
		// make that variable/method static

	}

}
