package inheritance;

class TV {// PARENT CLASS
	TV() { // CONS DEFAULT
		System.out.println("defalt cons ");
	}

	public void shows() {
		System.out.println("show the tv");
	}
}

class pendrive extends TV {
	pendrive() {
		System.out.println("deafault cons pendrive");
	}

	public void harshal() {
		System.out.println("pendrive show");
	}
}

class thethering extends TV {
	thethering() {
		System.out.println("ththring cons fefault");
	}

	public void kunal() {
		System.out.println("method kunal call nomal method");
	}
}

class live extends TV {
	live() {
		System.out.println("livecons fefault");
	}

	public void pankaj() {
		System.out.println("method pankaj call nomal method");
	}
}

public class Inheritances2 {

	public static void main(String[] args) {
		pendrive ref = new pendrive();
		ref.shows();
		ref.harshal();
		thethering ref1 = new thethering();
		ref.shows();
		ref1.kunal();
		live ref2 = new live();
		ref2.shows();
		ref2.pankaj();

	}

}
/*it is given condition hierachical inheritance .
*Inheritance-when one object acqires all the properties and behaviours of a parentes objec
*when you inherit from existing class you can reuse methods & field of the parwnts 
*you can add new mwthods & fields in your parents class also. */
