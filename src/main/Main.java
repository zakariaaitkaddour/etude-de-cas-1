package main;

import daoImp.BookDaoImpl;
import entities.Book;
import dao.BookDao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("This is main");
		Scanner scan = new Scanner(System.in);
		
		BookDaoImpl bookList = new BookDaoImpl();
		
		System.out.println("List of books :");
		
		for (Book book : bookList.getBooks()) {
			System.out.println("- Id_book: " + book.getId_book());
			System.out.println("- Name: " + book.getName_book());
			System.out.println("$***************************$");

		}
		
		String id_tobeDeltString = scan.nextLine();
		int id_toBeDelt = Integer.parseInt(id_tobeDeltString);
		
//		Book bookTodelt = new BookDao.getBoooks().get
		
		
	}

}
