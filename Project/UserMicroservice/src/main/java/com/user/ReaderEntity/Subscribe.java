package com.user.ReaderEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subscribe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer SubscriptionId;

	public Integer userId;
	public Integer digitalBookId;
	public String email;

	public Subscribe() {
		super();
	}

	public Subscribe(Integer subscriptionId, Integer userId, Integer digitalBookId, String email) {
		super();
		SubscriptionId = subscriptionId;
		this.userId = userId;
		this.digitalBookId = digitalBookId;
		this.email = email;
	}

	public Integer getSubscriptionId() {
		return SubscriptionId;
	}

	public void setSubscriptionId(Integer subscriptionId) {
		SubscriptionId = subscriptionId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getDigitalBookId() {
		return digitalBookId;
	}

	public void setDigitalBookId(Integer digitalBookId) {
		this.digitalBookId = digitalBookId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
