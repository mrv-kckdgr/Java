package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EmailLogger emailLogger=new EmailLogger();
		//emailLogger.log("Log mesajı");
		
		/*BaseLogger[] baseLoggers=new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
		(BaseLogger logger: baseLoggers) {
			logger.log("Log mesajı");
		}*/
		
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
