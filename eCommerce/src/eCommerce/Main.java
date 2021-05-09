package eCommerce;

import eCommerce.bussines.abstracts.UserService;
import eCommerce.bussines.concretes.EmailManager;
import eCommerce.bussines.concretes.UserManager;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entity.concretes.User;

public class Main {



	public static void main(String[] args) {
		
		UserService userManager = new UserManager(new HibernateUserDao(),new EmailManager());
		User user = new User();
		user.setName("0ptimist");
		user.setSurname("ne");
		user.setPassword("myPass1234");
		user.setMail("sallamadim@mail.com");
		user.setPhone("05354587559");
		
		
		String errTest;
	  	System.out.println(errTest = (userManager.add(user)).getErrorMessage());
	  	
	  	if(errTest == null)
	  		System.out.println(errTest = (userManager.Verification(user)).getErrorMessage());
	  	if(errTest == null) System.out.println("");
		
	}
	

}
