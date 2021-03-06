package wrapperclass;

public class Boxingoperation1 {

	public static void main(String[] args) {

		char c1 = 'A';

		Character charObj1 = new Character(c1);// explicit boxing
		System.out.println(c1 == charObj1);// true
		Character charObj2 = new Character('Z');//

		Character charObj3 = 'H';// implicit boxing or autoboxing

		System.out.println("c1: " + c1);// '
		System.out.println("charObj1: " + charObj1);
		System.out.println("charObj2: " + charObj2);
		System.out.println("charObj3: " + charObj3);

		boolean b = true;// primitive type

		System.out.println(b);
		Boolean bObj = new Boolean(b);// explicit boxing
		System.out.println(bObj == b);// true
	}

}
