package mernisDemo.entities.concretes;

import mernisDemo.entities.abstracts.CheckCustomerService;

public class CheckCustomerManager implements CheckCustomerService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
