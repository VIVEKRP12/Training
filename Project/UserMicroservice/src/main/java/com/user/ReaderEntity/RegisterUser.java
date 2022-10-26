package com.user.ReaderEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegisterUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	private String signUpAs;

	private String firstName;

	private String lastName;

	private String email;

	private String password;

	public RegisterUser() {
		super();
	}

	public RegisterUser(Integer usrId, String signUpAs, String firstName, String lastName, String email,
			String password) {
		super();
		this.userId = userId;
		this.signUpAs = signUpAs;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer usrId) {
		this.userId = userId;
	}

	public String getSignUpAs() {
		return signUpAs;
	}

	public void setSignUpAs(String signUpAs) {
		this.signUpAs = signUpAs;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
