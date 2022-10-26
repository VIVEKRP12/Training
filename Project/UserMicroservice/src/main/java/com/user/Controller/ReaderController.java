package com.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.ReaderEntity.Subscribe;
import com.user.ReaderService.SubscribeService;

@RestController
@RequestMapping("/subscribe")
public class ReaderController {
	@Autowired
	private SubscribeService subService;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/subscribe")
	public List<Subscribe> saveSubscribedBooks(@RequestBody List<Subscribe> subBook) {
		return subService.saveSubscribedBooks(subBook);
	}
	
	@GetMapping("/subscribedbooks")
	public List<Subscribe> getAllSubscribedBooks() {
		return subService.getAllSubscribedBooks();
	}

	@GetMapping("/getData/{id}")
	public Object getData(@PathVariable("id") Integer digitalBookId) {
		Object digitalBooks = restTemplate.getForObject("http://localhost:8085/sucbscribe/book" + digitalBookId,
				Object.class);
		return digitalBooks;
	}

	@GetMapping("/getDigitalBook")
	public Object getAllDigitalBooks() {
		Object digitalBooks = restTemplate.getForObject("http://localhost:8085/sucbscribe/book", Object.class);
		return digitalBooks;
	}

	@GetMapping("/searchBook")
	public Object searchDigitalBooks(@RequestParam("title") String title, @RequestParam("author") String author,
			@RequestParam("catogory") String category, @RequestParam("price") Double price,
			@RequestParam("Publisher") String publisher) {

		Object digitalBooks = restTemplate.getForObject(
				"http://localhost:8085/sucbscribe/digitalBook/search?catogory={category}&author={author}&price={price}&publuisher={publisher}&category={catogory}",
				Object.class);
		return digitalBooks;

	}

	@GetMapping("/digitalBook/{title}")
	public Object searchDigitalBookByTitle(@PathVariable String title) {
		Object digitalBooks = restTemplate.getForObject("http://localhost:8085/sucbscribe/digitalBook/title",
				Object.class);
		return digitalBooks;

	}

	@GetMapping("/digitalBook/{author}")
	public Object searchDigitalBookByAuthor(@PathVariable String author) {
		Object digitalBooks = restTemplate.getForObject("http://localhost:8085/sucbscribe/digitalBook/author",
				Object.class);
		return digitalBooks;

	}

	@GetMapping("/digitalBook/{price}")
	public Object searchDigitalBookByPrice(@PathVariable Double price) {
		Object digitalBooks = restTemplate.getForObject("http://localhost:8085/sucbscribe/digitalBook/price",
				Object.class);
		return digitalBooks;

	}

	@GetMapping("/digitalBook/{publisher}")
	public Object searchDigitalBookByPublisher(@PathVariable String publisher) {
		Object digitalBooks = restTemplate.getForObject("http://localhost:8085/sucbscribe/digitalBook/publisher",
				Object.class);
		return digitalBooks;

	}

	@GetMapping("/digitalBook/{category}")
	public Object searchDigitalBookByCategory(@PathVariable String category) {
		Object digitalBooks = restTemplate.getForObject("http://localhost:8085/sucbscribe/digitalBook/catogory",
				Object.class);
		return digitalBooks;

	}

}
