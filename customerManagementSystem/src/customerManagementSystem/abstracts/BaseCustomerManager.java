package customerManagementSystem.abstracts;

import java.rmi.RemoteException;

import customerManagementSystem.entities.Customer;

public class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) throws RemoteException {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " veri tabanýna kayýt edildi.");	
	}
}
