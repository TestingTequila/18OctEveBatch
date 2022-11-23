package _12oops;

public class ExecutingEncapsulation {

	public static void main(String[] args) {

		_1Encapsulation encap = new _1Encapsulation();
		encap.setName("Kerrie");
		encap.setSalary(10000);
		System.out.println("Pay " +encap.getName()+" a salary of " + encap.getSalary()+"$" + " in his account");
	}

}
