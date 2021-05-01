package reCapKodlamaio;

public class UserManager {
	public void add(User user) {
		System.out.println("\nKullanıcı eklendi.\nKullanıcı adı: " + user.firstName + " " + user.lastName);
	}
	
	public void addingMultipleUsers(User[] user) {
		System.out.println("\n*****Adding Multiple Users**********");
		System.out.println("Kullanıcılar başarılı bir şekilde eklenmiştir.");
		System.out.println("*******Adding Multiple Users Finish");
	}
	
	public void list(User[] user) {
		System.out.println("\nKullanıcılar başarılı bir şekilde listelendi.");
	}
	
	public void update(User user) {
		System.out.println("Güncelleme başarılı");
	}
	
	public void delete(User user) {
		System.out.println("Silme başarılı");
	}

}
