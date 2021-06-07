package core;

import entities.concretes.User;
import googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements GoogleAuthService {

	@Override
	public void register(User user) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.register(user);
		
	}

	@Override
	public void login(User user) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.login(user);
		
	}

}
