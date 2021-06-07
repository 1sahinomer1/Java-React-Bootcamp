package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		
		if(user.getPassword().length()<=6) {
			System.out.println("Sifre en az 6 karakterden olusmalidir.");
		}
		
		String EMAIL_PATTERN = "^[A-Za-z0-9_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if (!matcher.matches()) {
			System.out.println(user.getEmail() + " bu e-posta, formatina uygun degildir.");
		}
		
		for(User users:userDao.getAll()) {
			if(users.getEmail().equals(user.getEmail())) {
				System.out.println((user.getEmail() + "bu eposta uygundur."));
			}
		}
		if(user.getFirstName().length()<2 && user.getLastName().length()<2) {
			System.out.println("isim ve soyisim 2 karakterden daha kisa olamaz. ");
		}
	}

	@Override
	public void login(User user) {
		if(user.getVerify() == true) {
			userDao.login(user);
		}else {
			System.out.println("giris basarisiz.");
		}
		
	}

	@Override
	public void confirm(User user) {
		if(user.getVerify() == true) {
			userDao.confirm(user);
		}else {
			System.out.println("e posta dogrulanmamistir.");
		}
		
	}

	@Override
	public void registerWithAccount(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginWithAccount(User user) {
		// TODO Auto-generated method stub
		
	}

}
