package etrade.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import etrade.business.abstracts.UserService;
import etrade.entities.concretes.User;
import etrade.core.utilities.Util;

public class UserManager implements UserService {

	
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		if(user.getEmail()==null && user.getPassword()==null && user.getFirstName()==null && user.getLastName()==null) {
			System.out.println("Kullanıcı bilgileri zorunludur!!! Lütfen tüm alanları eksiksiz doldurunuz!!!");
		}if(user.getPassword().length()<=6) {
			System.out.println("Parola minimum 6 karakterden oluşmalıdır. Şu anki girdiğiniz  parola: " + user.getPassword());
		}if(user.getFirstName().length()<=2 && user.getLastName().length()<=2) {
			System.out.println("Kullanıcı adı ve parola minimum 2 harften oluşmalıdır!!! Şu an girmiş olduğunuz isim: " + user.getFirstName() + " soyisim: " + user.getLastName());
		}
		
		if(Util.emailValidate(user.getEmail())==false) {
			System.out.println("Lütfen geçerli bir email adresi giriniz!!! Şu anki girmiş olduğunuz mail adresi: " + user.getEmail());
		}
		
		
		
		System.out.println("****************************Kayıt ekleme sayfası***************************");
		System.out.println("Kullanıcı başarılı bir şekilde eklendi. Sisteme giriş bilgileriniz mail olarak gönderilecektir.");
		System.out.println("***************************************************************************");
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String email, String password) {
		System.out.println("*******************************Giriş ekranı********************************");
		if(email=="merve@merve.com" && password=="1234567") {
			System.out.println("Tebrikler:) Bilgileriniz doğru");
			return true;
		}else {
			System.out.println("Üzgünüz, şu an için giriş bilgileriniz hatalı!!!");
			return false;
		}
		
	}

}
