package objectclass;

public class Objectclass5 {
	 double salary=1234;
	double empid;
	
	Objectclass5(){
		empid=salary;	
	}
	public double tostring() {
return salary;
	}
//	public double hashcode() {
//		return salary;
//	}
//	public double hashcode1() {
//		return 40000;
//	}
	public static void main(String[] args) {
		Objectclass5 d1=new Objectclass5 ();
		System.out.println(d1);
		System.out.println(d1.salary);
		System.out.println(d1.hashCode());
		//System.out.println(d1.hashcode1());
	}

}
/*Objectclass =1.it is parent class of object and all classes of java by default
             2.it is the topmost class of java.*/
