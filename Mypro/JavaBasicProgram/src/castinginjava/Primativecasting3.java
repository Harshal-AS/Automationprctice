package castinginjava;

public class Primativecasting3 {
	void harshal5(double j) {
		System.out.println("j value "+j);
	}
	void harshal6(int k) {
		System.out.println("k value="+k);
	}
	
	public static void main(String[] args) {
		System.out.println("program start");
		Primativecasting3 t1=new Primativecasting3();
		t1.harshal5(40);// convert  lower to higher implicit
		System.out.println("program end");
	}

}
