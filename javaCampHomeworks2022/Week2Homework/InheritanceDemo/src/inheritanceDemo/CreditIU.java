package inheritanceDemo;

public class CreditIU {
	public void CalculateCredit(BaseCreditManager baseCreditManager) {
		baseCreditManager.calculate();

	}

}

// We use it this way because it is a reference type.
// This method can also be used for database migrations.
// Injecting.