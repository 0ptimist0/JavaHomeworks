package interfaceDemo.entities.concretes;

import java.rmi.RemoteException;

import interfaceDemo.dataAccess.abstracts.CustomerDalService;
import interfaceDemo.entities.abstracts.BaseCustomerManager;
import interfaceDemo.entities.abstracts.CheckCustomerService;

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
