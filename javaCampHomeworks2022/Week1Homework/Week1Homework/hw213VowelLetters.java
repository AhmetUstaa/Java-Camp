package javaCampHomeworks2022;

public class hw213VowelLetters {

	public static void main(String[] args) {
		char letter = 'A';

		switch (letter) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.print("Thick Vowel Letter");
			break;
		default:
			System.out.print("Thin Vowel Letter");
		}

	}

}
