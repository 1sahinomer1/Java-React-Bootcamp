package core;

import entities.concretes.User;

public interface GoogleAuthService {
	void register (User user);
	void login(User user);
	
}
