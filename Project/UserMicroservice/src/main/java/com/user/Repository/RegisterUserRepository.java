package com.user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.ReaderEntity.RegisterUser;

@Repository
public interface RegisterUserRepository extends JpaRepository<RegisterUser, Integer> {

	RegisterUser findByEmail(String email);

}
