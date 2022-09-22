package javaCampHomeworks2022;

public class hw28ArraysDemo {

	public static void main(String[] args) {
		String student1 = "Hansel";
		String student2 = "Gratel";
		String student3 = "Gargamel";
		String student4 = "Teletabies";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);

		System.out.println("------------------------------");

		String[] students = new String[4];
		students[0] = "Hansel";
		students[1] = "Gratel";
		students[2] = "Gargamel";
		students[3] = "Teletabies";
		//students[4] = "outofbounds";

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
			
		}
		System.out.println("------------------------------");
		//common usage
		for(String student:students) {
			System.out.println(student);
		}

	}

}
