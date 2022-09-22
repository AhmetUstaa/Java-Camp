package javaCampHomeworks2022;

public class hw211StringsDemo {

	public static void main(String[] args) {
		String message = "    The weather is great today.      ";
		System.out.println(message);

//		System.out.println("Number of characters : " + message.length());
//		System.out.println("5.character : " + message.charAt(4));

//		// If you want to use next time to this output you should
//		// create a new variable.
//		// newmessage = message.concat(" Hooray!")
//		System.out.println(message.concat(" Hooray!"));

//		System.out.println(message.startsWith("A"));
//		System.out.println(message.endsWith("."));

//		// The Java is a case sensitive language.
//		char[] characters = new char[5];
//		message.getChars(0, 5, characters, 0);
//		System.out.println(characters);

//		System.out.print(message.indexOf("er"));
//		System.out.print(message.lastIndexOf("to"));

		String newmessage = message.replace(' ', '_');
		System.out.println(newmessage);

		System.out.println(message.substring(2));
		System.out.println(message.substring(2, 7));

		for (String word : message.split(" ")) {
			System.out.println(word);
		}

		System.out.println(message.toLowerCase());

		// We use it when sending query statements to databases.
		System.out.println(message.toUpperCase());

		// We use it when we using another source data. Sometimes there may be gaps as
		// a result of incompatibilities when transferring data.
		System.out.println(message.trim());

	}

}
