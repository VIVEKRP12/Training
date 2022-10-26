package com.user.ReaderService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.ReaderEntity.RegisterUser;
import com.user.Repository.RegisterUserRepository;

@Service
public class RegisterUserServiceImpl implements RegisterUserService {
	@Autowired
	private RegisterUserRepository userRepo;

	@Override
	public Integer RegisterUser(RegisterUser user) {
		
		RegisterUser saveUser=userRepo.save(user);
		return saveUser.getUserId();
	}

	@Override
	public Optional<com.user.ReaderEntity.RegisterUser> findUserByEmail(String email) {
		RegisterUser saveUser=userRepo.findByEmail(email);
	   return  Optional.ofNullable(saveUser);
	}

}
