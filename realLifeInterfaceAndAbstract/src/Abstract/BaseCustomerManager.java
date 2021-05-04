package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	public abstract void save(Customer customer);
	
	//ortak
	//değişmeyecek kod
	/*public final void save(Customer customer) {
		System.out.println("Saved to db : " + customer.firstName);
	}*/
}
