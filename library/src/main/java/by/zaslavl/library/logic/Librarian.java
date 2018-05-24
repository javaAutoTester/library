package by.zaslavl.library.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import by.zaslavl.library.entity.Author;
import by.zaslavl.library.entity.Book;
import by.zaslavl.library.entity.Genre;
import by.zaslavl.library.entity.Library;

public class Librarian {
	/**
	 * Этот метод создает новую бибилиотеку.
	 * 
	 * @return object Library
	 */
	public static Library createNewLibrary() {
		Library newLibrary = new Library();
		return newLibrary;
	}

	/**
	 * Этот метод создает новую книгу
	 * 
	 * @param title- наименование книги
	 * @param year - год издания
	 * @param genre- жанр
	 * @return object Book
	 */
	public static Book createNewBook(String title, int year, Genre genre) {
		return new Book(title, year, genre);
	}

	/**
	 * Этот метод добавляет автора в книгу
	 * 
	 * @param book - книга, в которую нужно добавить автора
	 * @param first_name - имя автора
	 * @param father_name- отчество автора
	 * @param familly_name- фамилия автора
	 * @param birth_year- год рождения автора
	 */
	public static void addAuthorToBook(Book book, String first_name, String father_name, String familly_name,
			int birth_year) {
		String[] name = new String[] { first_name, father_name, familly_name };
		book.addAuthorToBook(new Author(name, birth_year));
	}

	/**
	 * Этот метод добавляет копию объекта book в библиотеку library
	 * 
	 * @param library - библиотека, в которую нужно добавить книгу
	 * @param book - добавляемя книга
	 */
	public static void addBookToLibrary(Library library, Book book) {
		library.addBookToLibrary(book);
	}
/**
 * Этот метод сохраняет объект в файл
 * @param library - объект типа Library, который нужно сохранить
 * @param file_name - имя файла, в который нужно сохранить объект
 */
	public static void saveLibraryToFile(Library library, String file_name) {
		String path = "/home/papa/Programs/Max-workspace/library/src/main/java/by/zaslavl/library/";
		File file = new File(path + file_name);
		if (file.exists()) {
			System.out.println("Writing to existing file");
		} else {
			// создаем объект типа File
			file = new File(path, file_name);
			// создаем файл на диске
			try {
				boolean created = file.createNewFile();
				if (created)
					System.out.println("File has been created");
			} catch (IOException ex) {

				System.out.println(ex.getMessage());
			}

		}
		SerializeDeserialize.serialize(file, library);
	}
	/**
	 * Читает объект из файла
	 * @param file_name - имя файла, из которого нужно прочитать объект
	 * @return object Library
	 */
	public static Library readLibraryFromFile(String file_name) {
		String path = "/home/papa/Programs/Max-workspace/library/src/main/java/by/zaslavl/library/";
		File file = new File(path + file_name);
		Library lib = null;
		if(file.exists()) {
		lib = (Library)	SerializeDeserialize.deserialize(file);
		}else { System.out.println("File does not exists"); }
		
		return lib;	
	}

}
