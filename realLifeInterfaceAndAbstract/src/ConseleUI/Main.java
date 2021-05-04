package ConseleUI;

import java.time.LocalDate;
import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		//BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		Customer customer = new Customer(1, "Merve", "KÜÇÜKDOĞRU", 1997, ***********L);
		baseCustomerManager.save(customer);

	}

}
