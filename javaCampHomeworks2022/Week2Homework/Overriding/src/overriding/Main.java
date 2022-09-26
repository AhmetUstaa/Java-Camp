package overriding;

public class Main {

	public static void main(String[] args) {
		BaseCreditManager[] creditManagers = new BaseCreditManager[] { new TeacherCreditManager(),
				new AgricultureCreditManager(), new StudentCreditManager() };

		for (BaseCreditManager creditManager : creditManagers) {
			System.out.println(creditManager.calculate(1000));
		}
	}

}
