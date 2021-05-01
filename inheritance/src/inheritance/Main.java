package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndividualCustomer merve=new IndividualCustomer();
		merve.customerNumber="12345";
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.customerNumber="78965";
		
		SendikaCustomer customer=new SendikaCustomer();
		customer.customerNumber="99999999";
		
		CustomerManager customerManager=new CustomerManager();
		//customerManager.add(corporateCustomer);
		//customerManager.add(merve);
		//customerManager.add(customer);
		
		Customer[] customers= {merve, customer, corporateCustomer};
		
		customerManager.addMultiple(customers);
	}

}
