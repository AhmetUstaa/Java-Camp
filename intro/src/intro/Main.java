package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		// Değişken isimlendirme Java'da camelCase yazılır.
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade Süresi";
		System.out.println(ortaMetin);
		System.out.println(altMetin);

		// integer
		int vade = 12;

		// double
		double dolarDun = 18.15;
		double dolarBugun = 18.15;

		// boolean
		boolean dolarDustuMu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		// array
		String[] krediler = { "Hizli Kredi", "Maaşını HalkBanktan", "Mutlu Emekli" };
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		System.out.println("**Foreach**");
		for (var kredi : krediler) {
			System.out.println(kredi);
		}

	}

}
