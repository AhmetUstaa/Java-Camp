package methodOverloading;

public class Main {

	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println(calc.add(2, 3));
		System.out.println(calc.add(2, 0, 50));
	}

}
