package exceptionhandling;
//import java.util.Scanner;
public class Exceptionhandling2 {

	public static void main(String[] args) {
		System.out.println("program start");
		//1.abnormal condition
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter array size: ");
//		int size=s.nextInt();
		int[] empIds = new int[2];
		//ArrayIndexOutOfBoundsException
		
	try {
			System.out.println(empIds[4]);// ArrayIndexOutOfBoundsException
			// try  statements write to exception 
	}
	
		catch (ArrayIndexOutOfBoundsException  l) {
			System.out.println(" Exception Handled : "+l);
			l.printStackTrace();
			System.out.println(l.getMessage());
			// catch=parmeter of the Throwable class
		}
			//or
//			catch (Throwable  n) {
//				System.out.println(" Exception Handled : "+n);
//				n.printStackTrace();// methos
//				System.out.println(n.getMessage());//methoda
			System.out.println("program end");
	}

}
	

