package polymorphismDemo;

public class CustomerManager {
	private BaseLogger _baseLogger;
	
	public CustomerManager(BaseLogger baseLogger) {
		this._baseLogger=baseLogger;
	}
	
	public void add() {
		System.out.println("Müşteri eklendi");	
		this._baseLogger.log("log mesajı");
		
	}
}
