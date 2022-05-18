package constructor;

class A {

	int i;
	A() {
		System.out.println("Running Class A() constructor..");
		i=10;
	}
	void display() {
		System.out.println("I am display() of class A.");
	}
}
class X {
	int j = 20;
	X() {
		System.out.println("Running Class X() constructor..");
	}
	void display() {
		System.out.println("I am display() of class X.");
	}
}
public class Cons5 {
	void display() {
		System.out.println("I am display() of class Cons5.");
	}
	public static void main(String args[]) {
		System.out.println("Main() of Class Cons5 is started...");
		A a1 = new A();//0
		//a1.display();//0
		System.out.println("Class A global varibale i = " + a1.i);//10
		a1.display();//0
		X x1 = new X();//0
		x1.display();//0
		System.out.println("Class X global varibale j = " + x1.j);//20
		Cons5 c1 = new Cons5();//0
		c1.display();//0
	System.out.println("Main() of Class Cons5 is ends here...");
	}


	}
