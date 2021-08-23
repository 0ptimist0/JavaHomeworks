package interfaceDemo.entities.concretes;

import interfaceDemo.entities.abstracts.CheckCustomerService;

public class CheckCustomerManager implements CheckCustomerService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
