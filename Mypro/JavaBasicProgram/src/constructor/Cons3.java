package constructor;

public class Cons3 {
	int roll;
	double salary;

	void display() {
		System.out.println("hi hARSHAL");
		System.out.println( salary);
		System.out.println(roll );
		//orSystem.out.println(roll+" "+ salary);
	}

	public static void main(String args[]) {
		Cons3 c1 = new Cons3();
		c1.display();
		
	}
}
	


// Constructor Overloading: more than on constructor in a class 
// * Rule: 1. type of args differ or 
// * 		 2. number of args differ or 
// * 		 3. position of args differ

