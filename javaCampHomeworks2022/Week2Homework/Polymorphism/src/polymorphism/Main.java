package polymorphism;

public class Main {

	public static void main(String[] args) {
		/*
		 * EmailLogger logger = new EmailLogger(); logger.Log("Log Message");
		 */
		/*
		 * BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new
		 * EmailLogger(), new DatabaseLogger(), new ConsoleLogger() }; for (BaseLogger
		 * logger : loggers) { logger.Log("Log Messsage"); }
		 */
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.Add();
	}

}
