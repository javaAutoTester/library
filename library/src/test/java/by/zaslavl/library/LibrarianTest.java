package by.zaslavl.library;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import by.zaslavl.library.entity.Book;
import by.zaslavl.library.entity.Genre;
import by.zaslavl.library.entity.Library;
import by.zaslavl.library.logic.Librarian;

public class LibrarianTest {
	
    /**
     * Method createNewLibrary must return  not null object type Library 
     */
	@Test
	public void testCreateNewLibrary() {
		Library lib = Librarian.createNewLibrary();
		assertTrue(lib != null);
	}
	
	/**
	 * Method createNewBook must return not null object type Book
	 * Field "title" must throw IllegalArgumentExeption when entered:  null, empty field, whitespace only.
	 * Field "year"  excepts values from 1900 to 3000. Other ways it throws IllegalArgumentExeption  
	 */
	
	@Test
	public void testCreateNewBook() {
	    Book b = Librarian.createNewBook("You!", 2000, Genre.PROSE);
		assertTrue(b != null);
	}
	
	/**
	 * title must be not null
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testCreateNewBook_Title_null() {
	    Librarian.createNewBook(null, 2000, Genre.PROSE);
	}
	
	/**
	 * title must be not empty
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testCreateNewBook_Title_empty() {
	   Librarian.createNewBook("", 2000, Genre.PROSE);
	}
	
    /**
     * title can not consist whitespace only
     */
	@Test(expected=IllegalArgumentException.class)
	public void testCreateNewBook_Title_space() {
	    Librarian.createNewBook("    ", 2000, Genre.PROSE);
	}
	
	
@Ignore
	@Test
	public void testAddAuthorToBook() {
		fail("Not yet implemented");
	}
@Ignore
	@Test
	public void testAddBookToLibrary() {
		fail("Not yet implemented");
	}
@Ignore
	@Test
	public void testSaveLibraryToFile() {
		fail("Not yet implemented");
	}
@Ignore
	@Test
	public void testReadLibraryFromFile() {
		fail("Not yet implemented");
	}

}
