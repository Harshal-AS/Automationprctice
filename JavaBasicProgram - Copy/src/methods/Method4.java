package methods;

public class Method4 {
	int age =12;
	static double salary=45120;

	public static void main(String[] args) {
	//	global variable 
		System.out.println(Method4.salary);//45120 static gv
		
		System.out.println(Method4.harshal(10, 20));
		
		Method4 ref=new Method4 ();
		System.out.println(ref.age);//12 non static global variable
		System.out.println(ref.addition(50, 400.20, 60));
		
		
		
		
	}
	 static int harshal(int num1,int num2) {
		 System.out.println(" num1: "+num1);//10
			
			System.out.println("num2: "+num2);//20
		int res=num1+num2;
		System.out.println("harshalre :"+res);//30
		 return res;//30
		
	}
	public  double  addition(int num1,double salary,int num2) {
		System.out.println("ADDITION num1: "+num1);//50
		System.out.println("ADDITION salary: "+salary);//400.20
		System.out.println("ADDITION num2: "+num2);//60
		double res=num1+salary+num2;
		System.out.println("addition result :"+res);//510.20
		return res;//510.20

}
}
/*Global variable=variable declared outside the method body but present inside class body .
Non  static global variable=variable declared outside the method body but present inside class body without static keywords.	

non static global variable or instance variable 
declared wiyhout static keywords
knows as instance/object member
memory loaded at runtime because instance/object member created the object 
created object 
classname referencename =new classname ();
can be access used 
refrencevariablename.nonstaticvariablename;
nonstatic gv memory location happens multiples based on objects crated */


