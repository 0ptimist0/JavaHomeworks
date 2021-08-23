package mernisDemo.entities.abstracts;

import java.rmi.RemoteException;

import mernisDemo.entities.concretes.Customer;

public interface CustomerService {
	void save(Customer customer) throws NumberFormatException, RemoteException;

}
