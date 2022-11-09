package _4statements;

public class _3LearningMultipleIfElseIfStatement {

	public static void main(String[] args) {
		
		String day = "Saturday";

      if(day.equalsIgnoreCase("Monday"))
      {
    	  System.out.println("I want to go to my college");
      }
      else if (day.equalsIgnoreCase("Tuesday"))
      {
    	  System.out.println(" I will go to Temple today");
      }
      else if(day.equalsIgnoreCase("WEDNESDAY"))
      {
    	  System.out.println("I will meet my family today");
      }
      else if(day.equalsIgnoreCase("Thursday"))
      {
    	  System.out.println("I will cook for me today");
      }
      else if (day.equalsIgnoreCase("Friday"))
      {
    	  System.out.println("I will visit some night club today");
      }
      
      else
      {
    	    System.out.println(" Its weekend...will chill at my place");
      }

	}

}
