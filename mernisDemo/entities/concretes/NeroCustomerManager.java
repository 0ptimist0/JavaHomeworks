package mernisDemo.entities.concretes;

import java.rmi.RemoteException;

import mernisDemo.dataAccess.abstracts.CustomerDalService;
import mernisDemo.entities.abstracts.BaseCustomerManager;
import mernisDemo.entities.abstracts.CheckCustomerService;

public class NeroCustomerManager extends BaseCustomerManager {

	CheckCustomerService checkCustomerService;
	CustomerDalService customerDalService;

	public NeroCustomerManager(CheckCustomerService checkCustomerService, CustomerDalService customerDalService) {
		this.checkCustomerService = checkCustomerService;
		this.customerDalService = customerDalService;
	}

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		customerDalService.save(customer);

	}

}
