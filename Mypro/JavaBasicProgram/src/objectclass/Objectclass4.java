package objectclass;

public class Objectclass4 {

	static int rollno;
	int lastno = 400;
	double empid = 1234;
	double salary;

	Objectclass4() {

		rollno = lastno;
		salary = empid;
	}

	// @ overridide
	public int hashcode() {
		return rollno;
	}

	public double hashcode1() {
		return salary;
	}

	public static void main(String[] args) {
		Objectclass4 w1 = new Objectclass4();
		System.out.println(w1);
		System.out.println(w1.toString());
		System.out.println(w1.hashcode());
		System.out.println(w1.hashcode1());
		

		boolean b=true;//  WRAPPER CLASS  CONVERT PRIMATIVE TO OBJECT 
		Boolean bObj=new Boolean(b);//
		
		System.out.println(bObj==b);
	}

}
