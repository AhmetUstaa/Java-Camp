package javaCampHomeworks2022;

public class hw212IsItAPrimeNumber {
	// 1 is not prime number but this program gives an output like about prime.
	// The bug means logical error about programming.

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2;
		// System.out.print(remainder);
		boolean isPrime = true;

		// This conditional(if blocks) code block fixed the bug about 1 is a prime.
		// This is defensive programming.
		if (number == 1) {
			System.out.println("The number is not prime!!");
			return;
		}

		if (number < 1) {
			System.out.println("Invalid Number");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		// same as isPrime==true
		if (isPrime) {
			System.out.print("The number is prime.");
		} else {
			System.out.println("The number is not prime!!");
		}
	}

}
