package inheritance2;

public class CustomerManager {
	
	public CustomerManager() {
		
	}
	
	public void add(Logger logger) {
		//musteri ekleme kodları
		System.out.println("Müşteri eklendi");
		
		//Bir iş yapan başka bir iş yapan sınıfı kullanacaksa asla newleyemez
		//EmailManager emailManager=new EmailManager();
		//emailManager.log();
		
		logger.log();
	}
}
