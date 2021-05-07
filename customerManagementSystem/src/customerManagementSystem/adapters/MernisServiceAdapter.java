package customerManagementSystem.adapters;

import java.rmi.RemoteException;

import customerManagementSystem.abstracts.CustomerCheckService;
import customerManagementSystem.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean ChekIfRealPerson(Customer customer) throws RemoteException {
	
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthDate());
	}

}
