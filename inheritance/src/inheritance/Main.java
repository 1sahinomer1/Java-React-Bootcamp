package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber="12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="6789";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="9999";
		
		CustomerManager customerManager = new CustomerManager();
		Customer[] customers = {engin,hepsiBurada,abc};
		customerManager.addMultiple(customers);
		
	}

}
