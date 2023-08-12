package com.sedat;

import java.util.List;

public interface IDisplay {
	
	void displayBooksToConsole(List<Book> books) ;
	
	void writeToFile(List<Book> books);
		
	

}
