package eCommerce.bussines.concretes;

import eCommerce.bussines.abstracts.Verification;
import eCommerce.core.Error;
import eCommerce.entity.concretes.User;

public class PhoneManager implements Verification{
	
	public Error verification(User user) {
		System.out.println("send Phone code -> "+user.getPhone());
		return new Error(false, "check the phone");
	}

}
