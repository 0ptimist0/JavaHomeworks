package eCommerce.bussines.abstracts;

import eCommerce.core.Error;
import eCommerce.entity.concretes.User;

public interface Verification {
	public Error verification(User user);
}
