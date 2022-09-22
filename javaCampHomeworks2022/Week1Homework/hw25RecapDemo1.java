package javaCampHomeworks2022;

public class hw25RecapDemo1 {

	public static void main(String[] args) {

		int number1 = 30;
		int number2 = 25;
		int number3 = 2;
		int theBiggest = number1;

		if (theBiggest < number2) {
			theBiggest = number2;
		}

		if (theBiggest < number3) {
			theBiggest = number3;
		}

		System.out.println("theBiggest = " + theBiggest);

	}
}
