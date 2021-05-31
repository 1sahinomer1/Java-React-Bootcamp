package Adaptors;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
			KPSPublicSoapProxy client = new KPSPublicSoapProxy();
			try {
				return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName() , customer.getLastName(),customer.getDateOfBirth().getYear());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}return false;
	}

}
