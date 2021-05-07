package customerManagementSystem.abstracts;

import java.rmi.RemoteException;

import customerManagementSystem.entities.Customer;

public interface CustomerService {
		void save(Customer customer) throws RemoteException;
}
