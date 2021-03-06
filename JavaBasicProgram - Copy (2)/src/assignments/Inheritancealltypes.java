package assignments;

/*pillars of oops (object oriented programming concept)
 * 1.inheritance
 * 2.Abstraction
 * 3.Encapsulation
 * 4.Polymorphism
*Inheritance=When one object acqiures all the properties & behaviors of the parent 
 *parent class is called inheritance
 * Types of Inheritance
 * a.single Inheritance
 * b.multilevel Inheritance
 * c.hierachical Inheritance
 * d.multiple Inheritance
 */
//a.single Inheritance
class Car {

	Car() { // superclass cons does not explicit the because the java compile at compile
			// time

		// default constructor with default super() mean cons call automaticlly java
		// compiler
	}

	public static void harshal(int age) { // method overriding
		System.out.println("method overriding: " + age);
	}

	void Display() { // regular method
		System.out.println("regular method");

	}

}

class Suzuki extends Car {
	int age = 12;
	double salary = 456789.20;// cons initilized instance member of the class

	Suzuki(int age, double salary) {// cons does not explicit the

		System.out.println(this.age);
		System.out.println(this.salary);

	}

	public void harshal() { // method overriding
		System.out.println("method overriding: ");

	}

	void add() { // regular method

		System.out.println(age + "  " + salary);// 10,200.10

	}
}

public class Inheritancealltypes {

	public static void main(String[] args) {
		Suzuki n1 = new Suzuki(10, 200.10);// reference to childclass object created to childclass
		Suzuki.harshal(5);
		n1.add();
		Car.harshal(4);
		Car n2 = new Suzuki(10, 12.10);
		n2.Display();
		Car.harshal(4);
		
		X a1=new X();
			a1.harshal(20.20f);
		Z a2=new Z();

	}
}

class X {
int age=23;
	X() {
		System.out.println(" cons ");
	}

	public void harshal(float f) {
		System.out.println(" method overriding");
	}

	void aaru(int age) {
this.age=age;
System.out.println(" this keyword: "+this.age);
	}

	class Y extends X {

		Y(int age) {
			super();// super statement
			System.out.println(" cons ");
		}

		public void harshal(float f) {
			System.out.println(" method overriding");
		}
	}

	class Z extends Y {
		double salary1;

		Z(double salary) {
			super(12);// super statement
			System.out.println(" cons ");
		}
			void met(double salary1) {
				this.salary1=salary1;
				System.out.println(this.salary1);
				
			}

		}
	}



/**
 * Inheritance: when a child class inherit the property of it parent class known
 * as Inheritnace representation: class childclassname extends parentclassname{
 * 
 * } Inheritance is achived by using super() statement --> used to call
 * parent/super class constructor based on paramter --> super() should be the
 * first statement inside the constructor body Note: In inheritance only
 * non-static members involves super() and this() can't be written together
 */
