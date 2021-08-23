package interfaceDemo.entities.abstracts;

import java.rmi.RemoteException;
import interfaceDemo.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public abstract void save(Customer customer) throws NumberFormatException, RemoteException;

}
