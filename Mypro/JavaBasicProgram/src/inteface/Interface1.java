package inteface;

interface company {
	int age = 12;// only variables and methods use //by default public static final
	static double salary = 1234;// variables

	public void display();// methods interface method (does not have a body)
}

interface employe {
	float f = 10.10f;
	boolean b = false;

	public void display2(); // interface method (does not have a body)
}

class worker implements company, employe {//TWO INTERFACE AND one class use the extends
	float t = 10.40f;

	public void display() {
		System.out.println("abstract method ");
	}

	public void display2() {// public is compulsay baecause public acess all space
		System.out.println("abstract1 method ");
	}

	public int addition(int num1) {//by default public abstract
		System.out.println("rerurn value 5addition method");
		return 5;
	}
}

public class Interface1 {

	public static void main(String[] args) {
		worker g1 = new worker();
		g1.display();
		g1.display2();
		System.out.println(g1.addition(5));
		System.out.println("variables static comapany: " + company.salary);
		System.out.println("variables non static comapany: " + g1.age);
		System.out.println("variables non static employ: " + g1.f);
		System.out.println("variables non static employ: " + g1.b);
		System.out.println("variables non static employ: " + g1.t);

	}

}
