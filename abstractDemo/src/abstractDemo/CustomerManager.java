package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager baseDatabaseManager;
	
	public void getCustomers() {
		//buraya manager oluşturursak bagımlı olmus oluruz
		baseDatabaseManager.getData();
	
	}
}
