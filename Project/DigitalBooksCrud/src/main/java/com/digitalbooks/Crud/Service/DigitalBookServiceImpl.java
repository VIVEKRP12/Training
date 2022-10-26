package com.digitalbooks.Crud.Service;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbooks.Crud.Entity.DigitalBook;
import com.digitalbooks.Crud.Error.RecordNotFoundException;
import com.digitalbooks.Crud.Repository.DigitalBookRepository;

@Service
public class DigitalBookServiceImpl implements DigitalBookService {

	@Autowired
	DigitalBookRepository digitalBookRepository;

	@Override
	public DigitalBook saveDigitalBook(DigitalBook book) {
		return digitalBookRepository.save(book);

	}

	@Override
	public DigitalBook getDigitalBookById(Integer id) {
		Optional<DigitalBook> digitalBookDb = digitalBookRepository.findById(id);
		if (digitalBookDb.isPresent()) {
			return digitalBookDb.get();
		} else {
			throw new RecordNotFoundException("Record not found!!");
		}
	}

	@Override
	public List<DigitalBook> searchDigitalBooks(String title, String author, String category, Double price,
			String publisher) {

		return digitalBookRepository.findAll();
	}

	@Override
	public List<DigitalBook> getAllDigitalBooks() {
		return digitalBookRepository.findAll();

	}

	@Override
	public List<DigitalBook> searchDigitalBookByTitle(String title) {
		return digitalBookRepository.findAll();

	}

	@Override
	public List<DigitalBook> searchDigitalBookByAuthor(String author) {
		return digitalBookRepository.findAll();
	}

	@Override
	public List<DigitalBook> searchDigitalBookByPrice(Double price) {
		return digitalBookRepository.findAll();
	}

	@Override
	public List<DigitalBook> searchDigitalBookByPublisher(String publisher) {
		return digitalBookRepository.findAll();
	}

	@Override
	public List<DigitalBook> searchDigitalBookByCategory(String catogory) {
		return digitalBookRepository.findAll();
	}

	@Override
	public DigitalBook updateDigitalBook(DigitalBook book) {
		Optional<DigitalBook> digitalBookDb = digitalBookRepository.findById(book.getDigitalBookId());

		if (digitalBookDb.isPresent()) {
			DigitalBook bookUpdate = digitalBookDb.get();
			bookUpdate.setCategory(book.getCategory());
			bookUpdate.setAuthor(book.getAuthor());
			bookUpdate.setPrice(book.getPrice());
			bookUpdate.setPublisher(book.getPublisher());
			bookUpdate.setActive(book.getActive());
			return bookUpdate;
		} else {
			throw new RecordNotFoundException("Record not found!!");
		}
	}

	@Override
	public void deleteDigitalBook(Integer id) {

		Optional<DigitalBook> digitalBookDb = digitalBookRepository.findById(id);

		if (digitalBookDb.isPresent()) {
			digitalBookRepository.delete(digitalBookDb.get());
		} else {
			throw new RecordNotFoundException("Record not found!!");
		}

	}

//	@Override
//	public List<DigitalBook> subscribedDigitalBook(Integer id) {
//		List<Integer> digitalBookId=digitalBookRepository.findByUserId(id);
//		
//		List<DigitalBook> digitalBooks=new ArrayList<DigitalBook>();
//			Optional<DigitalBook> book=digitalBookRepository.findById(digitalBookId.get(id));
//			if(book.isPresent()) {
//				digitalBooks.add(book.get());
//			}
//
//		return digitalBooks;
//	}

}
