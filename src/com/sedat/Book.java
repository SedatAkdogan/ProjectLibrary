package com.sedat;

public class Book {
	
	private String title;
	private String author;
	private String isbnNumber;
	private int publicationYear;
	
	public Book(String title, String author, String isbnNumber) {
		this.title = title;
		this.author = author;
		this.isbnNumber = isbnNumber;
		this.publicationYear = 0;
	}
	
	
	
	
	public Book(String title, String author, String isbnNumber, int publicationYear) {
		
		this.title = title;
		this.author = author;
		this.isbnNumber = isbnNumber;
		this.publicationYear = publicationYear;
	}
	
	
	public String getTitle() {
		return title;
	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
	
	public String getAuthor() {
		return author;
	}
//	public void setAuthor(String author) {
//		this.author = author;
//	}
	public String getIsbnNumber() {
		return isbnNumber;
	}
//	public void setIsbnNumber(String isbnNumber) {
//		this.isbnNumber = isbnNumber;
//	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	

}
