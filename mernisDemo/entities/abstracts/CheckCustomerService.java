package mernisDemo.entities.abstracts;

import java.rmi.RemoteException;

import mernisDemo.entities.concretes.Customer;

public abstract interface CheckCustomerService {
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
