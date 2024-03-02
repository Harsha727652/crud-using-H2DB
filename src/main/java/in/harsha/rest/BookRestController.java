package in.harsha.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.harsha.entity.Book;
import in.harsha.service.BookService;

@RestController
public class BookRestController {
@Autowired
 private BookService service;
 @PostMapping("/book")
	 public ResponseEntity<String> addBook(@RequestBody Book book)
	 {
		 String msg = service.upsert(book);
		 return new ResponseEntity<>(msg,HttpStatus.CREATED);
	 }
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getallbooks()
	{
		List<Book> books = service.getBooks();
		return new ResponseEntity<>(books,HttpStatus.OK);
	}
	@PutMapping("/book")
	 public ResponseEntity<String> updateBook(@RequestBody Book book)
	 {
		 String msg = service.upsert(book);
		 return new ResponseEntity<>(msg,HttpStatus.OK);
	 }
	@DeleteMapping("/book/{bookid}")
	public ResponseEntity<String> delete(@PathVariable Integer bookid)
	{
		String msg = service.delete(bookid);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
}
