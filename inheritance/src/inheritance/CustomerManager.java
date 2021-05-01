package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi");
	}
	//class lar referans tiptir
	/*public void add(CorporateCustomer customer) {
		System.out.println(customer.customerNumber + " kaydedildi");
	}*/
	
	//Aynı anda birden fazla müşteri
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer: customers) {
			add(customer);
		}
	}
}


//SOLID -> Open Closed Principle