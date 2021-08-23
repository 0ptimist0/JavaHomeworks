package mernisDemo.entities.abstracts;

import java.rmi.RemoteException;

import mernisDemo.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public abstract void save(Customer customer) throws NumberFormatException, RemoteException;

}
