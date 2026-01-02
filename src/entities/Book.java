package entities;

public class Book {
	private int id_book;
	private String name_book;
	private static int countBook = 0;
	
	// Constructor
	public Book(String name_book) {
		id_book = ++countBook;
		this.name_book = name_book;
	}

	public int getId_book() {
		return id_book;
	}

	public void setId_book(int id_book) {
		this.id_book = id_book;
	}

	public String getName_book() {
		return name_book;
	}

	public void setName_book(String name_book) {
		this.name_book = name_book;
	}
	
	
	
	
}
