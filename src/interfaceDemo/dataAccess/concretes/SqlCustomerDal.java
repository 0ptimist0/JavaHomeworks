package interfaceDemo.dataAccess.concretes;

import interfaceDemo.dataAccess.abstracts.CustomerDalService;
import interfaceDemo.entities.concretes.Customer;

public class SqlCustomerDal implements CustomerDalService {

	@Override
	public void save(Customer customer) {
		System.out.println("Save to db : " + customer.getName());
	}

}
