package com.sedat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library implements IDisplay {
	
	private List<Book> books;
	
	public Library() {
		books = new ArrayList<>();
		
	}
	
	public List<Book> getBooks(){
		return books;
	}
	
	public void addBook(Book book) {
		books.add(book);
		
	}
	public void removeBook(Book book) {
		books.remove(book);
	}
	
	public Book findBookByTitle(String title) { 
		for(Book book : books) {  // buradaki for döngüsü books adlı listenin her bir ögesini Book tipindeki book degiskenine atayarak dönüs yapar.
			if(book.getTitle().equalsIgnoreCase(title)) {
				 System.out.println("Book found:");
	                System.out.println("Title: " + book.getTitle());
	                System.out.println("Author: " + book.getAuthor());
	                System.out.println("ISBN: " + book.getIsbnNumber());
	                System.out.println("Publication Year: " + book.getPublicationYear());
	                System.out.println("--------------------------");
				return book ;
			}
		}
		System.out.println("Book not found");
		return null;
	}
	public Book findBookByIsbn(String isbn) { 
		for(Book book : books) {  // buradaki for döngüsü books adlı listenin her bir ögesini Book tipindeki book degiskenine atayarak dönüs yapar.
			if(book.getTitle().equals(isbn)) {
				 System.out.println("Book found:");
	                System.out.println("Title: " + book.getTitle());
	                System.out.println("Author: " + book.getAuthor());
	                System.out.println("ISBN: " + book.getIsbnNumber());
	                System.out.println("Publication Year: " + book.getPublicationYear());
	                System.out.println("--------------------------");
				return book ;
			}
		}
		System.out.println("Book not found");
		return null;
	}

	@Override
	public void displayBooksToConsole(List<Book> books) {
		for(Book book :books) {
			System.out.println("Title..: " + book.getTitle());
			System.out.println("Author..: " + book.getAuthor());
			System.out.println("ISBN..: " + book.getIsbnNumber());
			System.out.println("Publication Year..: " + book.getPublicationYear());
			System.out.println("------------------------------------------------------");
		}
		
	}
	

	@Override
	public void writeToFile(List<Book> books) {
		System.out.println("Kitaplar dosyaya yazdırıldı....");
		System.out.println("---------------------------------------------------------------------");
		
	}

}
