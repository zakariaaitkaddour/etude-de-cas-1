package daoImp;

import entities.Book;
import dao.BookDao;

import java.util.List;
import java.util.ArrayList;


public class BookDaoImpl implements BookDao {
	private List<Book> books;

	public BookDaoImpl() {
		books = new ArrayList<> ();
		books.add(new Book("Java"));
		books.add(new Book("Python"));
		books.add(new Book("Cpp"));
	}
	
	public List<Book> getBooks(){
		return books;
	}
	
	public Book getBookById(int id) {
		return books.get(id);
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void deleteBookById(Book book) {
		books.remove(book);
	}
	
	
}
