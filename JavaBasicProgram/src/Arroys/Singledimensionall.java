package Arroys;

public class Singledimensionall {

	public static void main(String[] args) {
		// char []d;//declared
		// d=new char[4];// declared & initilized
// or
		char[] d = new char[4];// size is mandatory
		System.out.println("not initilized ");
		System.out.println(d[0]);// o =space
		System.out.println(d[1]);// o =null value Because not initilized the value
		System.out.println(d[2]);// o =space
		System.out.println(d[3]);// o =space
//
		d[0] = 'A';
		d[1] = 'B';
		d[2] = 'C';
		d[3] = 'D';
		// OR
       // char[]d= {'A','B','C','D'};
		System.out.println("after initilized ");
		// access the element of the array
		System.out.println(d[0]);// 20
		// change the element of the array
		d[0] = 'z';
		System.out.println(d[0]);
		// access the element of the array
		System.out.println(d[1]);// 30 After initilized the value
		// change the element of the array
		d[1] = 'H';
		System.out.println(d[1]);
		System.out.println(d[2]);// 40
		System.out.println(d[3]);// 50
		// or
		System.out.println("total array element account: " + d.length);// aarayname.length
		// simple for loops use
        System.out.println("normal for loop ");
        // LHS should be same as RHS type in form of datatype or class
        // traversing array
        for(char v=0;v<d.length;v++) {
        System.out.println(d[v]);//
	}
        System.out.println(" for  loop ");
        // for each loop
	for (char as:d) {
		System.out.println(as);// java aaray element print one by one
	}
	for (char i=0;-0<d.length;i--) {
		System.out.println(d[i]);
	}
	
	
	}
	}


