package eCommerce.dataAccess.abstracts;

import eCommerce.entity.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);

	User get(int id);
	java.util.List<User> getAll();
}
