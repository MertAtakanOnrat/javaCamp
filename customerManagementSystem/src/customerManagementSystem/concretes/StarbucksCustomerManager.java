package customerManagementSystem.concretes;

import java.rmi.RemoteException;

import customerManagementSystem.abstracts.BaseCustomerManager;
import customerManagementSystem.abstracts.CustomerCheckService;
import customerManagementSystem.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) throws RemoteException{
		if(customerCheckService.ChekIfRealPerson(customer))	{
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " veri tabanýna kayýt edildi.");
		}
		else {
			System.out.println("Kayýt edilemedi.");
		}
	}

	
}
