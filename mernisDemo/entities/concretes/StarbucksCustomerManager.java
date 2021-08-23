package mernisDemo.entities.concretes;

import java.rmi.RemoteException;

import mernisDemo.dataAccess.abstracts.CustomerDalService;
import mernisDemo.entities.abstracts.BaseCustomerManager;
import mernisDemo.entities.abstracts.CheckCustomerService;

public class StarbucksCustomerManager extends BaseCustomerManager {
	CheckCustomerService checkCustomerService;
	CustomerDalService customerDalService;

	public StarbucksCustomerManager(CheckCustomerService checkCustomerService, CustomerDalService customerDalService) {
		this.checkCustomerService = checkCustomerService;
		this.customerDalService = customerDalService;
	}

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		if (checkCustomerService.checkIfRealPerson(customer))
			customerDalService.save(customer);
		else
			System.out.println("Not a valid person!");
	}

}
