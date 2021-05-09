package eCommerce.bussines.concretes;

import eCommerce.bussines.abstracts.Verification;
import eCommerce.core.Error;
import eCommerce.entity.concretes.User;

public class EmailManager implements Verification{
	
	public Error verification(User user) {
		System.out.println("send Mail -> "+user.getMail());
		return new Error(true,"check the mail");
	}

}
