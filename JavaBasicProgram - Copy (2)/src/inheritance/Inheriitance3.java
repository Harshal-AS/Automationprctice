package inheritance;

class A1 { // parents class
	int age = 12;
	static double salary = 100.10;
	static int empid = 1234;
}

class B1 extends A1 {
	int age1 = 10;
	static double salary = 100.20;
	static int empid = 1235;
}

class C1 extends B1 {
	int age2 = 8;
	static int empid = 1287;
}

public class Inheriitance3 {

	public static void main(String[] args) {
		System.out.println("program start");
		// class A1 static member acess
		System.out.println("static memeber" + A1.empid);
		System.out.println("static memeber" + A1.salary);
		// class B1 static member acess
		System.out.println("static memeber" + B1.salary);
		System.out.println("static memeber" + B1.empid);
		// class C1 static member acess
		System.out.println("static memeber" + C1.empid);

		// NON STATIC MEMBER it ie c1 behaviours b1 & b1 behaviours a1
		C1 h1 = new C1();
		System.out.println("non static memeber age:" + h1.age);
		System.out.println("non static memeber age1:" + h1.age1);
		System.out.println("non static memeber age2:" + h1.age2);
		B1 h2 = new B1();
		System.out.println("non static memeber age:" + h2.age);
		System.out.println("non static memeber age1:" + h2.age1);

	}

}
//it is given cindition is multilevel inheritance 
//or 
