package by.zaslavl.library.entity;

import java.io.Serializable;
import java.util.Arrays;

public class Book implements Cloneable, Serializable{
	private String title;
	private Author[] authors;
	private int year;
	private Genre genre;
	public Book() {
		
	}
	public Book(String title, int year, Genre genre) {
		super();
		this.title = title;
		this.authors = null;
		this.year = year;
		this.genre = genre;
	}
	
	
	public void addAuthorToBook(Author author) {
		if(this.authors == null) {this.authors = new Author[1]; authors[0]=author;
		}else {
		this.authors = Arrays.copyOf(this.authors, this.authors.length+1);
		this.authors[this.authors.length-1] = author;
		}
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Author[] getAuthors() {
		return authors;
	}
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getGenre() {
		
		return this.genre.getGenre();
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Book b = (Book) super.clone();
		b.authors = (Author[]) this.authors.clone();
		for (int i = 0; i < b.authors.length; i++) {
			b.authors[i] =  (Author) this.authors[i].clone();	
		}
		return b;	
	}
	
	
	
	

}
