package com.user.ReaderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.ReaderEntity.Subscribe;
import com.user.Repository.SubscribeRepository;
@Service
public class SubscribeServiceImpl implements SubscribeService {
	
	@Autowired
	public SubscribeRepository subRepo;

	@Override
	public List<Subscribe> saveSubscribedBooks(List<Subscribe> subBook) {
	
		return subRepo.saveAll(subBook);
	}

	@Override
	public List<Subscribe> getAllSubscribedBooks() {
		
		return subRepo.findAll();
	}

}
