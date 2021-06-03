package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	List<User> users = new ArrayList<User>();
	@Override
	public void register(User user) {
		System.out.println(user.getFirstName() + " kayit oldu.");
		users.add(user);
	}

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName()+" adli kullanici giris yapti.");
		
	}

	@Override
	public void confirm(User user) {
		System.out.println(user.getEmail() + " email adresiniz onaylanmistir.");
		user.setVerify(true);
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

}
