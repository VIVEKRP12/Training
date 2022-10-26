package com.user.ReaderService;

import java.util.List;

import com.user.ReaderEntity.Subscribe;

public interface SubscribeService {
	
	public List<Subscribe> saveSubscribedBooks(List<Subscribe> subBook);
	
	public List<Subscribe> getAllSubscribedBooks();

}
