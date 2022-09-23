package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		Calc calc = new Calc();
		int result = calc.add(3, 4);
		int result1 = calc.sub(5, 1);
		int result2 = calc.mul(7, 8);
		int result3 = calc.div(9, 10);

		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
// The most important feature of classes is to keep common operations.
// Another feature of classes is to keep Field and Attribute.