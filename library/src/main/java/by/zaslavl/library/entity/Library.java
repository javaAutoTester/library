package by.zaslavl.library.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class Library implements Cloneable, Serializable{
	private Book[] library;
	private Date dateOfLibrary;
	private int bookCount;
	

	public Library() {
		if(this.library == null) {this.library = new Book[5];}
		this.dateOfLibrary = new Date();
		this.bookCount = 0;
	}
	
	public void addBookToLibrary(Book book) {
		bookCount++;
		if(bookCount <= library.length) library[bookCount-1] = book;
		if(bookCount > library.length) {
			library = Arrays.copyOf(library, library.length+5);
			library[bookCount-1] = book;
		}		
	}		
	

	public Book[] getLibrary() {
		return library;
	}


	public Date getDate() {
		return dateOfLibrary;
	}
	

}
