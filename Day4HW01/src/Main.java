import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adaptors.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbuckCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarbuckCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1,"Ömer  faruk","Þahin",LocalDate.of(1998, 8, 30),"16141772010"));
		System.out.println();
	}

}
