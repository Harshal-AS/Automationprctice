package exceptionhandling;

public class Exceptionhandling {

	public static void main(String[] args) {
		int a=12;
		//1. abnormal statements
		int b=12/0;//Arithmetic Exception (abnormal condition)
		System.out.println(a);
		System.out.println(b);
		
		//2. abnormal statements
		int []c=new int [3];
		c[3]=121;//ArrayIndexOutOfBoundsException
		
		//3. abnormal statements
		String f="null";//NullPointerException
	System.out.println(f.length());//NullPointerException  
		//3. abnormal statements
		//String s= "abc";  
		//int num=Integer.parseInt(s);//NumberFormatException  
		
	}

}
