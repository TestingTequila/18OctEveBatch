package _7class;

public class ExecutingObject {

	public static void main(String[] args) {

		// NameOfTheClassWhoseCopyYouWantToCreate nameYouwantToGiveToYourCopiedThing =  new NameOfTheClassWhoseCopyYouWantToCreate();
		Resume jason = new Resume();
		jason.fName = "Jason";
		jason.lName = "Roger";
		jason.empId = 2518;
		jason.jobProfile = "QA";
		jason.isMarried = true;
		
		
		Resume kerrie = new Resume();
		kerrie.fName="Kerrie";
		kerrie.lName="Wright";
		kerrie.empId=8152;
		kerrie.jobProfile="DataAnalyst";
		kerrie.isMarried=false;

	}

}
