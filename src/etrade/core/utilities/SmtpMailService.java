package etrade.core.utilities;

public class SmtpMailService implements EmailService {

	@Override
	public void sendToEmail(String email) {
		System.out.println("Mail SMTP kullanarak başarılı bir şekilde gönderilmiştir. Mail adresiniz: " + email);
		
	}

}
