package mernisDemo.adapters;

import java.rmi.RemoteException;

import mernisDemo.entities.abstracts.CheckCustomerService;
import mernisDemo.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckCustomerService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getYearOfBird());
		return result;
	}

}
