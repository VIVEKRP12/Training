package com.digitalbooks.Crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbooks.Crud.Entity.DigitalBook;
import com.digitalbooks.Crud.Service.DigitalBookService;

@RestController
@RequestMapping("/digitalBook")
public class DigitalBookController {
	@Autowired
	DigitalBookService digitalBookService;

	@PostMapping("/digitalBook")
	public ResponseEntity<DigitalBook> saveDigitalBook(@RequestBody DigitalBook book) {
		return ResponseEntity.ok().body(digitalBookService.saveDigitalBook(book));
	}

	@GetMapping(value = "/digitalBook/{id}")
	public ResponseEntity<DigitalBook> searchDigitalBookById(@PathVariable Integer id, @RequestBody DigitalBook book) {
		return ResponseEntity.ok().body(digitalBookService.getDigitalBookById(id));
	}
	
	@GetMapping("/search?")
	public List<DigitalBook> searchDigitalBooks(@RequestParam("title")String title,
			@RequestParam("author") String author,
			@RequestParam("catogory")String category,
			@RequestParam("price")Double price,
			@RequestParam("Publisher")String publisher){
		
		return digitalBookService.searchDigitalBooks(title, author, category, price, publisher);
	}

	@GetMapping("/digitalBook/{title}")
	public ResponseEntity<List<DigitalBook>> searchDigitalBookByTitle(@PathVariable String title) {
		return ResponseEntity.ok().body(digitalBookService.searchDigitalBookByTitle(title));

	}

	@GetMapping("/digitalBook/{author}")
	public ResponseEntity<List<DigitalBook>> searchDigitalBookByAuthor(@PathVariable String author) {
		return ResponseEntity.ok().body(digitalBookService.searchDigitalBookByAuthor(author));

	}

	@GetMapping("/digitalBook/{price}")
	public ResponseEntity<List<DigitalBook>> searchDigitalBookByPrice(@PathVariable Double price) {
		return ResponseEntity.ok().body(digitalBookService.searchDigitalBookByPrice(price));

	}

	@GetMapping("/digitalBook/{publisher}")
	public ResponseEntity<List<DigitalBook>> searchDigitalBookByPublisher(@PathVariable String publisher) {
		return ResponseEntity.ok().body(digitalBookService.searchDigitalBookByPublisher(publisher));

	}

	@GetMapping("/digitalBook/{category}")
	public ResponseEntity<List<DigitalBook>> searchDigitalBookByCategory(@PathVariable String category) {
		return ResponseEntity.ok().body(digitalBookService.searchDigitalBookByCategory(category));

	}

	@GetMapping("/digitalBooks")
	public ResponseEntity<List<DigitalBook>> getAllDigitalBooks() {
		return ResponseEntity.ok().body(digitalBookService.getAllDigitalBooks());

	}

	@PutMapping("/digitalBook/{id}")
	public ResponseEntity<DigitalBook> updateEmployee(@PathVariable Integer id, @RequestBody DigitalBook book) {
		book.setDigitalBookId(id);
		return ResponseEntity.ok().body(digitalBookService.updateDigitalBook(book));
	}

	@DeleteMapping("/digitalBook/{id}")
	public ResponseEntity<String> deleteDigitalBook(@PathVariable Integer id) {
		digitalBookService.deleteDigitalBook(id);
		return ResponseEntity.ok().body("Record Deleted");
	}
	
//	@GetMapping("/subscribe/{id}")
//	public List<DigitalBook> getData(@PathVariable Integer id){
//		return digitalBookService.subscribedDigitalBook(id);
//	}


}
