package eCommerce.bussines.abstracts;

import eCommerce.core.Error;
import eCommerce.entity.concretes.User;

public interface UserService {
	Error add(User user);
	Error Verification(User user);

}
