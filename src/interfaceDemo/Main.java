package interfaceDemo;

import java.rmi.RemoteException;

import interfaceDemo.adapters.MernisServiceAdapter;
import interfaceDemo.dataAccess.concretes.SqlCustomerDal;
import interfaceDemo.entities.abstracts.BaseCustomerManager;
import interfaceDemo.entities.concretes.Customer;
import interfaceDemo.entities.concretes.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		Customer customer = new Customer();
		customer.setId(0);
		customer.setName("Optimist");
		customer.setLastName("Ne");
		customer.setNationalityId("12345678901");
		customer.setYearOfBird(1995);
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter(),new SqlCustomerDal());
		baseCustomerManager.save(customer);
	}

}
