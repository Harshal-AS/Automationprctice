package castinginjava;

public class Primitivecasting4 {
	double display1() {
		return 100.10;
	}

	public static void main(String[] args) {
		Primitivecasting4 t1=new Primitivecasting4();
		int res=(int)t1.display1();
		System.out.println(res);
		// double to int convert used the explicit
	}

}
