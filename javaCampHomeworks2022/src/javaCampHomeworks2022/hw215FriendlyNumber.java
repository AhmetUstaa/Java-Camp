package javaCampHomeworks2022;

public class hw215FriendlyNumber {

	public static void main(String[] args) {
		// The smallest friendly number are 220 and 284.
		// Numbers whose sum of positive divisors are equal to each other.

		int number1 = 220;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 = total1 + i;
			}
		}
		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				total2 = total2 + i;
			}

		}
		// If it is sufficient that one of the two is true you can use ||
		if (number1 == total2 && number2 == total1) {
			System.out.println("These numbers are friendly number.");

		} else {
			System.out.println("These numbers are not friendly number!!");
		}
	}

}
