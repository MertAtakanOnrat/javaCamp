package customerManagementSystem.concretes;

import customerManagementSystem.abstracts.CustomerCheckService;
import customerManagementSystem.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean ChekIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
		
	}

}
