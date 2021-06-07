import business.abstracts.UserService;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"omer","sahin","2133321","shnomr@gmail.com",false);
		UserService userService = new UserManager(new HibernateUserDao());
		userService.register(user1);
	}

}
