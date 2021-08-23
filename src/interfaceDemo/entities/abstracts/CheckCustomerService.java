package interfaceDemo.entities.abstracts;

import java.rmi.RemoteException;

import interfaceDemo.entities.concretes.Customer;

public abstract interface CheckCustomerService {
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
