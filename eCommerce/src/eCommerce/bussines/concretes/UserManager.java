package eCommerce.bussines.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.bussines.abstracts.UserService;
import eCommerce.bussines.abstracts.Verification;
import eCommerce.core.Error;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entity.concretes.User;

public class UserManager implements UserService {
	private final String mailRegex = " ^[\\w!#$%&amp;’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

	private UserDao dao;
	private Verification verif;
	public UserManager(UserDao dao,Verification verification) {
		this.dao = dao;
		this.verif = verification;
	}
	
	public Error add(User user) {
		if(user.getPassword().length() < 7) return new Error(true,"your password does not meet the criteria! ");
		if(user.getName().length() < 2) return new Error(true,"name Error");
		
		Pattern pattern = Pattern.compile(mailRegex);
		Matcher matcher = pattern.matcher(user.getMail());
		
		if(matcher.matches()) return new Error(true,"you entered an incorrect email!! ");
		
		
		/*for(User u: dao.getAll()) {
			if(user.getName() == u.getName()) return new Error(true,"there is another user with the same mail");
		}*/ // User Control
		
		dao.add(user);
		return new Error(false, null);
	}
	public Error Verification(User user) {
		return verif.verification(user);
		
	}

}
