package com.user.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.ReaderEntity.RegisterUser;
import com.user.ReaderService.RegisterUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private RegisterUserService userService;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/signup")
	public Integer RegisterUser(@RequestBody RegisterUser user) {
		return userService.RegisterUser(user);
	}

	@PostMapping("/login")
	public RegisterUser LoginUser(@RequestBody RegisterUser user) {
		Optional<RegisterUser> users = userService.findUserByEmail(user.getEmail());
		if (users.isPresent()) {
			RegisterUser rs = users.get();
			if (rs.getPassword().equals(user.getPassword())) {
				return rs;
			}
		}
		return null;

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
		Object digitalBooks = restTemplate.getForObject("http://localhost:8085/user/digitalBook/title", Object.class);
		return digitalBooks;

	}

	@GetMapping("/digitalBook/{author}")
	public Object searchDigitalBookByAuthor(@PathVariable String author) {
		Object digitalBooks = restTemplate.getForObject("http://localhost:8085/user/DigitalBook/author", Object.class);
		return digitalBooks;

	}

	@GetMapping("/digitalBook/{price}")
	public Object searchDigitalBookByPrice(@PathVariable Double price) {
		Object digitalBooks = restTemplate.getForObject("http://localhost:8085/user/digitalBook/price", Object.class);
		return digitalBooks;

	}

	@GetMapping("/digitalBook/{publisher}")
	public Object searchDigitalBookByPublisher(@PathVariable String publisher) {
		Object digitalBooks = restTemplate.getForObject("http://localhost:8085/user/digitalBook/publisher",
				Object.class);
		return digitalBooks;

	}

	@GetMapping("/digitalBook/{category}")
	public Object searchDigitalBookByCategory(@PathVariable String category) {
		Object digitalBooks = restTemplate.getForObject("http://localhost:8085/users/digitalBook/catogory",
				Object.class);
		return digitalBooks;

	}

}
