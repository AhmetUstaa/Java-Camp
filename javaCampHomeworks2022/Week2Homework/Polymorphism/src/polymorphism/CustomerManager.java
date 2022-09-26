package polymorphism;

public class CustomerManager {
	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}

	public void add() {
		System.out.println("The customer added.");
		this.logger.log("Log message");
	}

}
