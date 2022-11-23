package _9typesOfmethods_ParametersConcept;

public class ExecutingTypesOfMethods {

	public static void main(String[] args) {

           MethodWithoutReturnTypeAndWithoutParameter mwrtawp = new MethodWithoutReturnTypeAndWithoutParameter();
           mwrtawp.a=122;
           mwrtawp.b=89;
           mwrtawp.addition();
           
           MethodWithoutReturnTypeAndWithParameter mwrtawtp = new MethodWithoutReturnTypeAndWithParameter();
           mwrtawtp.addition(121, 88);
           mwrtawtp.subtraction(12, 81);
           mwrtawtp.multiplication();
           
           MethodWithoutReturnTypeAndWithParameter matho = new MethodWithoutReturnTypeAndWithParameter();
           matho.multiplication();
	}

}
