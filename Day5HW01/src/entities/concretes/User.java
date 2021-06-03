package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {
	private int id ;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private boolean verify;
	public User() {
		super();
	}

	public User(int id, String firstName, String lastName, String password, String email,boolean verify) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.verify = verify;
	}
	public boolean getVerify() {
		return verify;
	}
	public boolean setVerify(boolean verify) {
		return this.verify=verify;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
