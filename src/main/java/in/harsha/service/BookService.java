package in.harsha.service;

import java.util.List;

import in.harsha.entity.Book;

public interface BookService {
	public String upsert(Book book);
	public List<Book> getBooks();
	public String delete(Integer bookid);
}

