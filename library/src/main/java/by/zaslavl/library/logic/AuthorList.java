package by.zaslavl.library.logic;

import java.util.LinkedList;
import java.util.List;

import by.zaslavl.library.entity.Author;
import by.zaslavl.library.entity.Book;
import by.zaslavl.library.entity.Library;

public class AuthorList implements ListManager{
	
/**
 * Данный метод создает список авторов, книги которых есть в библиотеке
 */
	public List<LibraryItem> createList(Library library) {
		List<LibraryItem> authorlist = new LinkedList<LibraryItem>();
		Book[] lib = library.getLibrary();
		for (int i = 0; i < lib.length && lib[i] != null; i++) {
			for (int j = 0; j < lib[i].getAuthors().length; j++) {
				try {
					authorlist.add((LibraryItem) lib[i].getAuthors()[j].clone());
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		for (int i = 0; i < authorlist.size(); i++) {
			LibraryItem a = authorlist.get(i);
			for (int j = i + 1; j < authorlist.size(); j++) {
				if (a.equals(authorlist.get(j))) {
					authorlist.remove(j);
				}
			}
		}

		return authorlist;
	}
	
	/**
	 * Данный метод пока ничего не создает
	 */
	
	public List<LibraryItem> createList(Library library, String s) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Этот метод печатает список авторов, переданный в качестве параметра
	 */
	public void printList(List<LibraryItem> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(
					"№" + (i + 1) + "  " + ((Author) list.get(i)).getName()[2] + "  " + ((Author) list.get(i)).getName()[0] + "  "
							+ ((Author) list.get(i)).getName()[1] + "  " + ((Author) list.get(i)).getBirth_year());
		}
		
	}

	

}
