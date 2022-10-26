package com.user.ReaderService;

import java.util.Optional;

import com.user.ReaderEntity.RegisterUser;

public interface RegisterUserService {
	public Integer RegisterUser(RegisterUser User);
	
	public Optional<RegisterUser> findUserByEmail(String email);

}
