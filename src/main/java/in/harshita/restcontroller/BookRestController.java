package in.harshita.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.harshita.binding.Book;

@RestController
public class BookRestController {
	@PostMapping(
			value = "/book",
			consumes=  {"application/xml","application/json"},
			produces = "text/plain"
	)
	public String addBook(@RequestBody Book b) {
		System.out.println(b);
		// logic to save in db
		return "Book Added";
	}
	
	
	@GetMapping( 
			value = "/book",
			produces = {"application/xml", "application/json"}
	)
	public Book getBook() {
		Book book = new Book(101, "Java", 543.00);
		return book;
	}

}
