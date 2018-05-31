package by.zaslavl.library;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import by.zaslavl.library.entity.Author;
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
	 * Field "year"  excepts values from 1 to 9999. Other ways it throws IllegalArgumentExeption  
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
	public void book_title_null() {
	    Librarian.createNewBook(null, 2000, Genre.PROSE);
	}
	
	/**
	 * title must be valid
	 */
	@Test(expected=IllegalArgumentException.class)
	public void book_title_valide() {
	   Librarian.createNewBook("  &*%$#@", 2000, Genre.PROSE);
	}
	
	/**
	 * year must be valid
	 */
	@Test(expected=IllegalArgumentException.class)
	public void book_year_valide() {
	   Librarian.createNewBook("You!", -3, Genre.PROSE);
	}
	
	
	@Test
	public void testAddAuthorToBook() {
	Book b = Librarian.createNewBook("You!", 2000, Genre.PROSE);
	Librarian.addAuthorToBook(b, "Андрей","Андреевич", "Андреев", 2010);
	String[] auth_name = b.getAuthors()[0].getName();
	assertTrue(auth_name[0].equals("Андрей") && auth_name[1].equals("Андреевич")&& auth_name[2].equals("Андреев")
			   && b.getAuthors()[0].getBirth_year()==2010);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void author_name_valide() {
	Book b = Librarian.createNewBook("You!", 2000, Genre.PROSE);
	Librarian.addAuthorToBook(b, "00000","   ", "!!!!!!!", 2010);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void author_birth_year_valide() {
	Book b = Librarian.createNewBook("You!", 2000, Genre.PROSE);
	Librarian.addAuthorToBook(b, "Андрей","Андреевич", "Андреев", -1);
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
