package inheritance;

class fruit{
	int age;
	fruit(){
	age=12;
	System.out.println("fruits of the cons ");
	}
	void display() {
	System.out.println("normal methods ");	
}
}
	 class apple extends fruit{
		apple(){
			
			//System.out.println("apple child name :"+age);	
		}
			public void display1() {
				System.out.println("normal method");
			}
		
	 public void display2  () {
		 
		System.out.println(" display 2");
	}
	}
public class Inheritance4 {

	public static void main(String[] args) {
		fruit h1=new apple ();
		System.out.println("apple child name :"+h1.age);
		h1.display();
		
		apple h2=new apple ();
		System.out.println("apple child name :"+h1.age);
		h2.display();
		h2.display1();
		h2.display2();
	}
}


