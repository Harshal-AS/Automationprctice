package encapsulation;

class Harshal {
	private int age = 12;
	private double salary = 100.10;// private means acess within the class
	
	// so use the getter & setter method in given below
	// getter method

	public int getage() {
		System.out.println("getter method1 age");
		return age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getsalary() {
		System.out.println("getter method1 salary");
		return salary;

	}

	// setter methods
	public void setage(int age) {
	this.age=age;
		System.out.println("setter method2 age");
	}

	public void setsalary(double salary) {
		this.salary = salary;
		System.out.println("setter method2 salary");
	}
}

public class Encapsulation1 {

	public static void main(String[] args) {
		Harshal t1 = new Harshal();
		System.out.println("accessing private data member outside the class using getter concept:" + t1.getage());
		System.out.println("accessing private data member outside the class using getter concept:" + t1.getsalary());
		
		
		t1.setage(8);// updated value
		t1.setsalary(400.10);// updated value
		System.out.println("accessing private data member outside the class using getter concept:" + t1.getage());
		System.out.println("accessing private data member outside the class using getter concept:" + t1.getsalary());
		// initial value
		Harshal t2 = new Harshal();
		System.out.println("accessing private data member outside the class using getter concept:" + t2.getage());
		System.out.println("accessing private data member outside the class using getter concept:" + t2.getsalary());
	}
}
/*1.Getter method help to access private variable outside the class
 * 2.declared with public
 * 3.return type of getter method should be same as private variable
 * 4.it should be return private variable 
 * 
 * 1.Setter method helps to modify or updated private variable outside the class
 * 2.declared with public.
 * 3.return type of setter method should be void.
 * 4.parameter datatype should be same as private variable 
 */

