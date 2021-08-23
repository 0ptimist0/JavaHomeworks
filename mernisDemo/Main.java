package mernisDemo;

import java.rmi.RemoteException;

import mernisDemo.adapters.MernisServiceAdapter;
import mernisDemo.dataAccess.concretes.SqlCustomerDal;
import mernisDemo.entities.abstracts.BaseCustomerManager;
import mernisDemo.entities.concretes.Customer;
import mernisDemo.entities.concretes.StarbucksCustomerManager;

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
