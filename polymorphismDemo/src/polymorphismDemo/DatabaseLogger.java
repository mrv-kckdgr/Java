package polymorphismDemo;

public class DatabaseLogger extends BaseLogger{
	//@override
	public void log(String message) {
		System.out.println("Logged to database: " + message);
	}
}
