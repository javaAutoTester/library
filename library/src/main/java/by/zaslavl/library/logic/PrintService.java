package by.zaslavl.library.logic;

import java.util.List;

import by.zaslavl.library.entity.Author;
import by.zaslavl.library.entity.Book;

public class PrintService {
	/**
	 * Этот метод позволяет вывести список книг, переданный в качестве параметра
	 * 
	 * @param listbook
	 */

	public static void printBookList(List<Book> listbook) {
		for (int i = 0; i < listbook.size(); i++) {
			Book b = listbook.get(i);
			System.out.println("№" + (i + 1) + "  " + b.getTitle() + "  " + b.getYear() + "  " + b.getGenre());
			for (int j = 0; j < b.getAuthors().length; j++) {
				System.out.println("      Автор: " + b.getAuthors()[j].getName()[2] + "  "
						+ b.getAuthors()[j].getName()[0] + " " + b.getAuthors()[j].getName()[1]);

			}

		}

	}

	/**
	 * Этот метод печатает список авторов, переданный в качестве параметра
	 * 
	 * @param authorlist
	 */
	public static void printAuthorList(List<Author> authorlist) {
		for (int i = 0; i < authorlist.size(); i++) {
			System.out.println(
					"№" + (i + 1) + "  " + authorlist.get(i).getName()[2] + "  " + authorlist.get(i).getName()[0] + "  "
							+ authorlist.get(i).getName()[1] + "  " + authorlist.get(i).getBirth_year());
		}
	}

}
