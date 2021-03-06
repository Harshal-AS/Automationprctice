package encapsulation;

public class Encapsulationall {
	private int age = 12;
	private double salary;
	private char c = 'Z';
	private boolean b;

	/* Getter method= it is help to access private variable outside the class
	 * 1. it is declared public
	 * 2.it is return type samr as private variable
	 * 3.it should be return type private variable
	 */
	
	public int a() {
		return age;
	}

	public double b() {
		return salary;
	}

	public char c() {
		return c;
	}

	public boolean d() {
		return b;
	}

	
	/* *  Setter method= it is helps to modified or updated to private variable 
	 * outside the class
	 * 1.declared with public
	 * 2.it is return type void (no return type)
	 * 3.it is parameter datatype same as the private variable
	 * 
	 */
	
	public void e(int age) {

	}

	public void f(double salary) {

	}

	public void g(char c) {

	}

	public void h(boolean b) {

	}

	public static void main(String[] args) {
		// acess  the private variable
		Encapsulationall r1=new Encapsulationall();
System.out.println(" getter method acess to private variable:  "+r1.a());
System.out.println(" getter method acess to private variable:  "+r1.b());
System.out.println(" getterr method acess to private variable:  "+r1.c());
System.out.println(" getter method acess to private variable:  "+r1.d());
//updated value call method 
System.out.println("..........................................");
r1.e(10);
r1.f(700.10);
r1.g('z');
r1.h(true);
System.out.println(" setter method update to private variable:  "+r1.a());
System.out.println(" setter method update to private variable:  "+r1.b());
System.out.println(" setter method update to private variable:  "+r1.c());
System.out.println(" setter method update to private variable:  "+r1.d());
// initial value private variable
System.out.println("..........................................");
Encapsulationall r2=new Encapsulationall();
System.out.println("initial value  private variable:  "+r2.a());
System.out.println(" initial value  private variable:  "+r2.b());
System.out.println(" initial value private variable:  "+r2.c());
System.out.println(" initial value  private variable:  "+r2.d());
	}

}
/*Encapsulation= 1.It is wrapping code & data together in a single unit.
 * 2.'sensitive data hide for user'.
 * 3.declared with private 
 * 4.provide the get & set method to access & updated the value of private variable
 * 
 *5. we can created fully encapsulated all data member in the class private 
 *6. so use the get & set method.
 * 
 * */
