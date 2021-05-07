package customerManagementSystem;

import java.rmi.RemoteException;
import java.sql.Date;

import customerManagementSystem.abstracts.BaseCustomerManager;
import customerManagementSystem.adapters.MernisServiceAdapter;
import customerManagementSystem.concretes.NeroCustomerManager;
import customerManagementSystem.concretes.StarbucksCustomerManager;
import customerManagementSystem.entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1, "Mert Atakan", "Onrat", "40510250502", 1999));

	}

}
