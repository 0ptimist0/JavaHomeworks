package interfaceDemo.entities.abstracts;

import java.rmi.RemoteException;

import interfaceDemo.entities.concretes.Customer;

public interface CustomerService {
	void save(Customer customer) throws NumberFormatException, RemoteException;

}
