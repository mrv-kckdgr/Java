package etrade;

import etrade.business.abstracts.AuthService;
import etrade.business.abstracts.UserService;
import etrade.business.concretes.AuthManager;
import etrade.business.concretes.UserManager;
import etrade.core.utilities.HostingMailService;
import etrade.core.utilities.SmtpMailService;
import etrade.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		AuthService authService1=new AuthManager(new UserManager(), new SmtpMailService());
		AuthService authService2=new AuthManager(new UserManager(), new HostingMailService());
		User user1 = new User(1, "Merve", "KÜÇÜKDOĞRU", ".merve@merve.com", "1234567");
		User user2 = new User(2, "Merve", "YILMAZ", "merve@merve.com", "1234567");
		User user3 = new User(3, "A", "B", "merve@merve.com", "98765");
		
		authService1.register(user1);
		authService2.register(user2);
		//authService.register(user3);
		
		authService1.login(user1.getEmail(), user1.getPassword());
		authService2.login(user2.getEmail(), user2.getPassword());
		//authService.login(user3.getEmail(), user3.getPassword());
		

	}

}
