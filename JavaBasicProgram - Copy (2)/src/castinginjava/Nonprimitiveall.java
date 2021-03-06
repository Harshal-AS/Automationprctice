package castinginjava;

class monday {
	int age;
	double salary = 1234.45;

	void pk(double salary) { // regular/non satic/concreate method

		System.out.println(" local variable: " + salary);// 4 local variable

	}

	void dispaly1() { // only non -static method override to subclass
		System.out.println("only non -static method override ");
	}
}

class sunday extends monday {
	void harshal(int age, double salary) {// regular/non satic/concreate method
		super.age = age; //
		super.salary = salary;
		System.out.println("differential between global & local variable at same name: " + age);
		System.out.println("differential between global & local variable at same name: " + salary);
		// 2,20.20
	}

	void dispaly1() { // only non -static method override to subclass
		System.out.println("only non -static method override ");
	}
}

class tuesday extends sunday {
	void har(int age) { // regular/non satic/concreate method
		System.out.println(age);// 5
	}

	void dispaly1() { // only non -static method override to subclass
		System.out.println("only non -static method override ");
	}
}

class wednesday extends tuesday {
	void aaru() {
		System.out.println("void regular metnod");// regular/non satic/concreate method
	}

	void dispaly1() { // only non -static method override to subclass
		System.out.println("only non -static method override ");

	}
}

public class Nonprimitiveall {

	public static void main(String[] args) {
		System.out.println("program end");
		tuesday r1 = new wednesday();// upcasting
		r1.dispaly1(); // override method call
		r1.har(5);
		r1.harshal(2, 20.20);
		r1.pk(4);
		System.out.println("......................................");
		wednesday r2 = new wednesday();// object created childclass to refer to childclas
		r2.dispaly1();// override method call
		r2.aaru();
		r2.har(7);
		r2.pk(8);
		r2.harshal(3, 30.30);
		System.out.println("......................................");
		wednesday r3 = (wednesday) r1; // downcasting
		r3.dispaly1();// override method call
		r3.aaru();
		r3.har(7);
		r3.pk(8);
		r3.harshal(3, 30.30);
		System.out.println("......................................");
		tuesday r4 = (tuesday) r1; // downcasting
		r4.dispaly1();// only call override not mandatory call to call method
		System.out.println("......................................");
		monday r5 = new sunday();// upcasting
		r5.dispaly1();// only call override not mandatory call to call method
		System.out.println("program end");
	}
}
/* 
 * derived or non-primitive casting=converting onetype of object to other type object
 two types of  derived or non-primitive casting
 1.up casting= converting subclass/childclass object into parent / superclass class
 up casting used both ways implicit & explicit 
 a).Implicit casting=done by the compiler
 b).Explicit casting=done by the programmer
 2.Down casting=Converting superclass/parent class object into childclass/subclass
 Down casting onlt used 1 way explicit
  a).Explicit casting=done by the programmer
  upcasting syntax= parentclass ref1=new childclass();
  downcasting syntax= childclass ref2=(childclass)ref1;
 
 
 
 * 
 * */
