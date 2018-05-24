package by.zaslavl.library.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import by.zaslavl.library.entity.Book;
import by.zaslavl.library.entity.Library;

public class BookList implements ListManager {

	/**
	 * Данный метод создает список всех книг, имеющихся в переданной библиотеке
	 */
	public List<LibraryItem> createList(Library library) {
		List<LibraryItem> listAllBook = new ArrayList<LibraryItem>();
		for (int i = 0; i < library.getLibrary().length && library.getLibrary()[i] != null; i++) {
			Book b = library.getLibrary()[i];
			try {
				listAllBook.add((LibraryItem) b.clone());
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listAllBook;
	}

	/**
	 * Этот метод создает список книг из переданной библиотеки, в фамилии любого из
	 * авторов которых (этих книг) встречается последовательность симловов
	 * "familly_name" без учета регистра
	 */

	public List<LibraryItem> createList(Library library, String familly_name) {
		List<LibraryItem> bookListByAuthor = new ArrayList<LibraryItem>();
		for (int i = 0; i < library.getLibrary().length && library.getLibrary()[i] != null; i++) {
			Book b = library.getLibrary()[i];
			// компеллируем регулярное выражение в объект типа Pattern
			Pattern p = Pattern.compile(familly_name.toLowerCase());
			for (int j = 0; j < b.getAuthors().length; j++) {
				if (p.matcher(b.getAuthors()[j].getName()[2].toLowerCase()).find()) {
					try {
						bookListByAuthor.add((LibraryItem) b.clone());
					} catch (CloneNotSupportedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return bookListByAuthor;
	}

	/**
	 * Этот метод позволяет вывести список книг, переданный в качестве параметра
	 */
	public void printList(List<LibraryItem> list) {
		for (int i = 0; i < list.size(); i++) {
			Book b = (Book) list.get(i);
			System.out.println("№" + (i + 1) + "  " + b.getTitle() + "  " + b.getYear() + "  " + b.getGenre());
			for (int j = 0; j < b.getAuthors().length; j++) {
				System.out.println("      Автор: " + b.getAuthors()[j].getName()[2] + "  "
						+ b.getAuthors()[j].getName()[0] + " " + b.getAuthors()[j].getName()[1]);
			}
		}
	}

}
