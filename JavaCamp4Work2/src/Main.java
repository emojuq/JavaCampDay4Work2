import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer = new Customer(1, "Emre", "Aydýn", LocalDate.of(2002, 8, 27), "54838081502");
		customerManager.Save(customer);
	}

}
