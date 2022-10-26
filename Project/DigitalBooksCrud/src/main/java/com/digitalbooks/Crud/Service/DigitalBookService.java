package com.digitalbooks.Crud.Service;

import java.util.List;

import com.digitalbooks.Crud.Entity.DigitalBook;

public interface DigitalBookService {
	public DigitalBook saveDigitalBook(DigitalBook book);

	public DigitalBook getDigitalBookById(Integer id);

	public List<DigitalBook> searchDigitalBooks(String title, String author, String category, Double price,
			String publisher);

	public List<DigitalBook> searchDigitalBookByTitle(String title);

	public List<DigitalBook> searchDigitalBookByAuthor(String author);

	public List<DigitalBook> searchDigitalBookByPrice(Double price);

	public List<DigitalBook> searchDigitalBookByPublisher(String publisher);

	public List<DigitalBook> searchDigitalBookByCategory(String catogory);

	public List<DigitalBook> getAllDigitalBooks();

	public DigitalBook updateDigitalBook(DigitalBook book);

	public void deleteDigitalBook(Integer id);

//	public List<DigitalBook> subscribedDigitalBook(Integer authorId);

}
