package in.harsha.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.harsha.entity.Book;
import in.harsha.repo.BookRepositry;

@Service
public class BookServiceImpl implements BookService{
	private BookRepositry bookrepo;
	
	public BookServiceImpl(BookRepositry bookrepo) {
		this.bookrepo = bookrepo;
	}

	@Override
	public String upsert(Book book) {
	    Integer bookid = book.getBookid();
	    bookrepo.save(book);
	    if (bookid==null) {
			return "record inserted";
		} else {
			return "record updated";
		}
	}

	@Override
	public List<Book> getBooks() {
		List<Book> list = bookrepo.findAll();
		return list;
	}

	@Override
	public String delete(Integer bookid) {
		bookrepo.deleteById(bookid);
		return "record deleted";
	}

}
