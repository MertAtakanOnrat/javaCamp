package customerManagementSystem.abstracts;

import java.rmi.RemoteException;

import customerManagementSystem.entities.Customer;

public interface CustomerCheckService {
	boolean ChekIfRealPerson(Customer customer) throws RemoteException;
}
