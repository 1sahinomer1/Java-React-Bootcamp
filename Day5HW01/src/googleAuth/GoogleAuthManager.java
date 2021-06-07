package googleAuth;

import entities.concretes.User;

public class GoogleAuthManager {
	public void register(User user) {
		System.out.println(user.getFirstName() + " google hesabiniz ile uye oldunuz.");
	}
	public void login(User user) {
		System.out.println(user.getFirstName() + " google hesabiniz ile giris yaptiniz.");
	}
}
