package by.zaslavl.library.logic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import by.zaslavl.library.entity.Author;
import by.zaslavl.library.entity.Book;
import by.zaslavl.library.entity.Library;

public class FindService {

	/**
	 * Данный метод создает список всех книг, имеющихся в переданной библиотеке
	 * 
	 * @param library
	 * @return
	 * @throws CloneNotSupportedException
	 */
//	public static List<Book> createBookList(Library library) throws CloneNotSupportedException {
//		List<Book> listAllBook = new ArrayList<Book>();
//		for (int i = 0; i < library.getLibrary().length && library.getLibrary()[i] != null; i++) {
//			Book b = library.getLibrary()[i];
//			listAllBook.add((Book) b.clone());
//		}
//		return listAllBook;
//	}

	/**
	 * Этот метод создает список книг из переданной библиотеки, в фамилии любого из
	 * авторовов которых (этих книг) встречается последовательность симловов
	 * "familly_name" без учета регистра
	 * 
	 * @param library
	 * @param familly_name
	 * @return
	 * @throws CloneNotSupportedException
	 */

//	public static List<Book> createBookListByAuthor(Library library, String familly_name)
//			throws CloneNotSupportedException {
//		List<Book> bookListByAuthor = new ArrayList<Book>();
//		for (int i = 0; i < library.getLibrary().length && library.getLibrary()[i] != null; i++) {
//			Book b = library.getLibrary()[i];
//			// компеллируем регулярное выражение в объект типа Pattern
//			Pattern p = Pattern.compile(familly_name.toLowerCase());
//			for (int j = 0; j < b.getAuthors().length; j++) {
//				if (p.matcher(b.getAuthors()[j].getName()[2].toLowerCase()).find()) {
//					bookListByAuthor.add((Book) b.clone());
//				}
//			}
//		}
//		return bookListByAuthor;
//	}

	/**
	 * Данный метод создает список авторов, книги которых есть в библиотеке
	 * @param library
	 * @return object LinkedList<Author>
	 * @throws CloneNotSupportedException
	 */
//	public static List<Author> createAuthorList(Library library) throws CloneNotSupportedException {
//		List<Author> authorlist = new LinkedList<Author>();
//		Book[] lib = library.getLibrary();
//		for (int i = 0; i < lib.length && lib[i] != null; i++) {
//			for (int j = 0; j < lib[i].getAuthors().length; j++) {
//				authorlist.add((Author) lib[i].getAuthors()[j].clone());
//			}
//		}
//		for (int i = 0; i < authorlist.size(); i++) {
//			Author a = authorlist.get(i);
//			for (int j = i + 1; j < authorlist.size(); j++) {
//				if (a.equals(authorlist.get(j))) {
//					authorlist.remove(j);
//				}
//			}
//		}
//
//		return authorlist;
//	}

}
