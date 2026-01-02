package dao;

import java.util.List;
import entities.Book;

public interface BookDao {
	List<Book> getBooks();
	Book getBookById(int id);
	void addBook(Book book);
	void deleteBookById(Book book);
	
}
